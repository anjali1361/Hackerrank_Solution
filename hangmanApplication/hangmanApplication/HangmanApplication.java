import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

class Hangman {
    String mysteryWord;
    StringBuilder currentGuess;
    ArrayList<Character> previousGuesses = new ArrayList<>();

    int maxTries =6;
    int currentTry =0;

    ArrayList<String> dictionary = new ArrayList<>();
    private static FileReader fileReader;
    private static  BufferedReader bufferReader;

    public Hangman() throws IOException{
        initializeStreams();
        mysteryWord = pickWord();
        currentGuess = initializeCurrentGuess();
    }

    public void initializeStreams() throws IOException {
        try{
            File inFile = new File("dictionery.txt");
            fileReader = new FileReader(inFile);
            bufferReader = new BufferedReader(fileReader);
            String currentLine = bufferReader.readLine();
            
            while (currentLine != null){
                dictionary.add(currentLine);
                currentLine = bufferReader.readLine();
            }
            bufferReader.close();
            fileReader.close();
        }catch(IOException e){
            System.out.println("Could not init Streams");
        }
    }

    public String pickWord() {
        Random rand = new Random();
        int wordIndex = Math.abs(rand.nextInt()%dictionary.size());
        return dictionary.get(wordIndex);
    }

public StringBuilder initializeCurrentGuess() {
    StringBuilder current = new StringBuilder();
    for(int i =0;i<mysteryWord.length()*2;i++){
        if(i%2 == 0){
            current.append("_");
        }else{
            current.append(" ");
        }
    }
    return current;
}

public String getFormalCurrentGuess() {
    return "Current Guess:" + currentGuess.toString();
    
}
public boolean gameOver(){
   if(didWeWin()){
      System.out.println();
      System.out.println("Congrats! You Won! You guessed the right word"); 
      return true;
   }else if(didWeLose()){
    System.out.println();
    System.out.println("Sorry! you lost. You spent all of you 6 tries."+"The word was "+mysteryWord+"."); 
    return true;
   }
   return false;
}
public boolean didWeLose(){
    return currentTry >= maxTries;
}

public boolean didWeWin(){
    String guess = getCondensedCurrentGuess();
    return guess.equals(mysteryWord);
}

public String getCondensedCurrentGuess() {
    String guess = currentGuess.toString();
    return guess.replace(" ","");
}

public boolean isGuessedlready(char guess) {
    return previousGuesses.contains(guess);
}
public boolean playGuess(char guess) {
    boolean isItGoodGuess = false;
    previousGuesses.add(guess);
    for(int i=0;i<mysteryWord.length();i++){

      if(mysteryWord.charAt(i) == guess){
        currentGuess.setCharAt(i*2, guess);
        isItGoodGuess =true;
      
      }
    }

    if(!isItGoodGuess){
      currentTry++;
    }
    return isItGoodGuess;
}

public String drawPicture(){
    switch(currentTry){
        case 0: return noPersonDraw();
        case 1: return addHeadDraw();
        case 2: return addBodyDraw();
        case 3: return addOneArmDraw();
        case 4: return addSecondArmDraw();
        case 5: return addFirstLegDraw();
        default: return fullPersonDraw();
    }
}

private String noPersonDraw() {
    return "----------";
}
private String addHeadDraw() {
    return "--||--------"; 
}
private String addBodyDraw() {

    return "--||--||------";
    
}
private String addOneArmDraw() {
    return "--||--||--||----";
}
private String addSecondArmDraw() {
    return "--||--||--||--||--";
}
private String fullPersonDraw() {
    return "||--||--||--||--||--";
}
private String addFirstLegDraw() {
    return "||--||--||--||--||--||"; 
}

}


public class HangmanApplication {
   public static void main(String[] args) throws IOException{
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome to hangman! I will pick a word and you will try to guess it character"
    +" by character."
    +"\nIf you guess wrong 6 times ,then I win.\nIf you can guess it before then, you win."
    +" Are you ready? Ihope so because I am");
 
    System.out.println();
 
    System.out.println("I have picked my word, Below is a Picture, and below"
    +" that is your current guess, which starts off as nothing.\n Every time you "
    +"guess incorrectly. I add a body part to the picture. \nWhen there is a full"
    +" person you loss");
 
    boolean doYouWantToPlay = true;
    while(doYouWantToPlay){
 
     //setting up the game 
    
         //Playing the  game
         System.out.println();
         System.out.println("Alright Let's Play");
         Hangman game = new Hangman();

         do{
             //draw the things...
             System.out.println();
             System.out.println(game.drawPicture());
             System.out.println();
             System.out.println(game.getFormalCurrentGuess());
             System.out.println(game.mysteryWord);
             System.out.println();

             //Get the guess
             System.out.println("Enter a character that you think is in the word");
             char guess = (sc.next().toLowerCase()).charAt(0);
             System.out.println();

             //Check if the character is guested
             while(game.isGuessedlready(guess)){
                System.out.println("Try again! You have already guessed that character.");
                guess = (sc.next().toLowerCase()).charAt(0);
             }

             //play the guess
             if(game.playGuess(guess)){
                System.out.println("Great Guess! Taht character is in the word");
             }
             else{
                System.out.println("Unfortunately that character isn't in the word");
             }

         }while(!game.gameOver());//keep playing until the game is over
 
     
        //want to keep playing or not
        System.out.println();
        System.out.println("Do you want to play another game? Enter Y if you do.");
        Character response = (sc.next().toUpperCase()).charAt(0);
        doYouWantToPlay = (response == 'Y');
    }
    sc.close();
  }

}
