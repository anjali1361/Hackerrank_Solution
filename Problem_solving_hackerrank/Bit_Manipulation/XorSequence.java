import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;   

public class XorSequence {       
  public static long get(long a){
    long w = a%8;
    if(w==0 || w==1) return a;
    if(w==2 || w==3) return 2;
    if(w==4 || w==5) return a+2;
    if(w==6 || w==7) return 0;
    return 0;


  }
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        while(q-- !=0){
            long l = sc.nextLong();
            long r = sc.nextLong();
            System.out.println(get(r)^get(l-1));
        }
       
    }    
}