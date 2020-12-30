/* package codechef; // don't place package name! */

/* package codechef; // don't place package name! */

/* package codechef; // don't place package name!



/* Name of the class has to be "Main" only if the class is public. */

import java.util.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TreasureHunt  {
    static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    } 
	public static void main (String[] args) throws Exception
	{
		FastReader br=new FastReader();
		
		try{
		int t=br.nextInt();
		while(t-->0)
		{
		   int temp[][]=new int[5][5];
		   int k=0;
		   int l=0;
		   for(int i=0;i<5;i++)
		   {
		       for(int j=0;j<5;j++)
		       {
		           temp[i][j]=br.nextInt();
		           if(temp[i][j]==1)
		           {
		               k=i;
		               l=j;
		           }
		       }
		   }
		   char f=br.next().charAt(0);
		   int h=Math.abs(l-2)+Math.abs(k-2);
		   System.out.println(h);
		}
	}
	catch(Exception e){}
		
		
	}
}

