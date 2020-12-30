/* package codechef; // don't place package name! */

/* package codechef; // don't place package name! */

/* package codechef; // don't place package name!



/* Name of the class has to be "Main" only if the class is public. */

import java.util.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class ExaminationConundrum {
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
		FastReader fr=new FastReader();
		
		try{
		
		   
        StringBuffer ans = new StringBuffer();
        int t = fr.nextInt();

        while(t-- >0) {
            int n=fr.nextInt();
            int sum=0;
            for(int i=0;i<n;i++)
            {
                int ti=fr.nextInt();
                sum+=ti;
            }
            if(sum>1440)
                ans.append(-1+"\n");
            else
            {
                int d=1440-sum;
                int hrs=d/60;
                int min=d%60;
                ans.append(hrs+" "+min+"\n");
            }

        }
        System.out.println(ans);
		
	}
	catch(Exception e){}
		
		
	}
}
