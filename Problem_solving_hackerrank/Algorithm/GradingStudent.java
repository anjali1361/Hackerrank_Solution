import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class GradingStudent{


    public static int[] gradingStudents(int[] arr){

        for(int i=0;i<arr.length;i++){

            if(arr[i]>=38){

            int nextMultipleOfFive = 5 - (arr[i]%5) + arr[i];

            if(nextMultipleOfFive - arr[i]<3){
                arr[i] = nextMultipleOfFive;
            }

         }

        }

        return arr;

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int arr[] = new int[n];
         for(int i=0;i<n;i++){
              
              arr[i]= sc.nextInt();

         }
      int result[] =  gradingStudents(arr);
      for(int i=0;i<result.length;i++){
              
             System.out.print(result[i]+(i != result.length-1 ? "\n":""));

         }

         System.out.println("");

    }
}