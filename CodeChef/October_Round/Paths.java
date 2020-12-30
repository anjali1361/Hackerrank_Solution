/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Paths
{    static class FastReader{
          BufferedReader br;
          StringTokenizer st;
          
          public FastReader()
          {
                  br = new BufferedReader(new InputStreamReader(System.in));
          }
          
          String next(){
               while(st==null || !st.hasMoreTokens()){
                    try{
                         st = new StringTokenizer(br.readLine());
                    }
                    catch (IOException e){
                         e.printStackTrace();
                    }
                    }
                    return st.nextToken();
               }
          
          int nextInt(){
               return Integer.parseInt(next());
          }
     }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		//! @ % & * () _ {} # ~ : < > ? "" | ^
		FastReader f=new FastReader();
		int t=f.nextInt();
		while(t-->0){
		    
		    int n=f.nextInt();
		    
		    long c[]=new long[31];
		    c[0]=1;
		    for (int i=1;i<c.length;i++) {
		         for (int j=0;j<i;j++ ) c[i]+=c[j]*c[i-1-j];
		    } 
		    
		    System.out.println(c[n]);
		    
		}
	}
}
