import java.util.Scanner;

public class ChefAndEasyQueries {

    public static long solve(long arr[],long k){
        int i =0;
        long leftOver =0;
        while(i<arr.length && leftOver>=0){
            leftOver = leftOver+arr[i];
            leftOver = leftOver - k;
            i += 1;
        }

        if(leftOver<0){
            return i;
        }else{
           long j=(leftOver/k);
           return i+j+1;
        }
    }

    

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int t = sc.nextInt();

        for(int i=0;i<t;i++){
            int n,k;
            n= sc.nextInt();
            k=sc.nextInt();

            long arr[] = new long[n];
            for(int j=0;j<n;j++){
                   arr[j] = sc.nextLong();
            }

            long result = solve(arr,k);
            sb.append(result);
            sb.append("\n");

        }

        System.out.print(sb);

          
    }
        
}
    

