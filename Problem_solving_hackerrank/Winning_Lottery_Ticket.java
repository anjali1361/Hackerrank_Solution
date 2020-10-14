//but this will give timeLimit Error according to the constrainrs provided in hackerrank
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Winning_Lottery_Ticket {

    // Complete the winningLotteryTicket function below.
    static long winningLotteryTicket(String[] tickets) {
        int count=0;

        for(int i=0;i<tickets.length;i++){
            for(int j=i+1;j<tickets.length;j++){
                if(!tickets[i].equals(tickets[j]) && hasUniqueNumeral(tickets[i],tickets[j])){
                  count++;  
                }
            
        }
     }

    return Long.valueOf(count); 


}
static boolean hasUniqueNumeral(String a,String b){
    String c=a+b;
    if(c.length()<10){
        return false;
    }
    Set<Character> charSet = new HashSet<>();

    for(char current:c.toCharArray()){
        charSet.add(current);
    }
    if(charSet.size() == 10){
        return true;
    }else{
        return false;
    }

}

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] tickets = new String[n];

        for (int i = 0; i < n; i++) {
            String ticketsItem = scanner.nextLine();
            tickets[i] = ticketsItem;
        }

        long result = winningLotteryTicket(tickets);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

