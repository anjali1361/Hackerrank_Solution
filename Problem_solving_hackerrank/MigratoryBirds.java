import java.io.*;
import java.util.*;

public class MigratoryBirds {

   static int[] h=new int[6];

    // Complete the migratoryBirds function below.
static int migratoryBirds(int[] arr) {
    int ans=0;
    int max=h[1];
    for(int i=2;i<6;i++){
        if(max<h[i]){
            max = h[i];
            ans=i;
        }
    }
        
    return ans;    
}

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];


        for(int i=0;i<n;i++){

           arr[i] = sc.nextInt();
           h[arr[i]]++;

        }

        System.out.println(migratoryBirds(arr));


        
    }
}

