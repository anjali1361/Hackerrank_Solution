
import java.util.*;
public class Solution11 {


  static int findMaxSum(int[][] mat){
      
      int max = Integer.MIN_VALUE;
      for(int i=0;i<4;i++){
          for(int j=0;j<4;j++){
              int sum = (mat[i][j]+mat[i][j+1]+mat[i][j+2]+mat[i+1][j+1]+mat[i+2][j]+mat                         [i+2][j+1]+mat[i+2][j+2]);

              max = Math.max(sum,max);
          }
      }
      return max;
  }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        System.out.println(findMaxSum(arr));

        scanner.close();
    }
}