import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// question below

//Your task is to write a regex which will match word starting with vowel (a,e,i,o, u, A, E, I , O or U).
//The matched word can be of any length. The matched word should consist of letters (lowercase and uppercase both) only.
//The matched word must start and end with a word boundary.

public class MatchingWordBoundry{    

    public static void main(String[] args) {
        
        Regex_Test tester = new Regex_Test();
        //"Found any match?" gives true
        tester.checker("\\b[aeiouAEIOU][a-zA-Z]*\\b"); // Use \\ instead of using \ 
    
    }
}

class Regex_Test {

    public void checker(String Regex_Pattern){
    
        Scanner Input = new Scanner(System.in);
        String Test_String = Input.nextLine();
        Pattern p = Pattern.compile(Regex_Pattern);
        Matcher m = p.matcher(Test_String);
        System.out.println(m.find());
    }   
    
}