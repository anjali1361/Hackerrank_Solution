/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ChefAndNumbers
{
	   static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    static class pair
    {
        String key;
        int val;
        pair(String s,int v)
        {
            this.key=s;
            this.val=v;
        }
    }


    public static void main(String[] args) {
    FastReader fr = new FastReader();
        StringBuffer ans = new StringBuffer();
//        int t = fr.nextInt();

        int n=fr.nextInt();
        int m=fr.nextInt();
        int arr[]=new int[n];
        int arr1[]=new int[m];
        for(int i=0;i<n;i++)
            arr[i]=i+1;
        for(int i=0;i<m;i++)
            arr1[i]=i+1;

        HashMap<Integer, Integer> s = new HashMap<Integer, Integer>();

        for (int i = 0; i < n; i++)
            s.put(arr[i], 0);

        // Subtract sum from second array elements one
        // by one and check it's present in array first
        // or not
//        System.out.println(s);
        int max=(m+n)-(m+n)%5;
        int c=0;
        for (int j = 0; j < m; j++)
        {
            for(int i=5;i<=max;i+=5)
            {
                int x=i;
//                System.out.println(x-arr1[j]);
                if (s.containsKey(x - arr1[j]))
                c++;
            }

        }
        System.out.println(c);

    }

}

