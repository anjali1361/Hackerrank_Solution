import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day25{

    public static boolean isPrime(int n){
        if(n <= 1) return false;
    
        for(int i=2;i<=Math.sqrt(n);i++){

            if(n%i == 0) return false;
        }
       return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num_arr = new int[n];
        for(int i=0;i<n;i++){
            num_arr[i]=sc.nextInt();

            if(isPrime(num_arr[i])) System.out.println("Prime");
            else System.out.println("Not prime");
        }

       sc.close();  
        
    }

}




