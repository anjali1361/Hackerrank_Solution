
import java.util.*;

public class Solution10 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        String binary = Integer.toBinaryString(n);
        int maxZeros =0;
        int consZeros =0;

        for(int i=0;i<binary.length();i++){
            char ele = binary.charAt(i);

            if(ele == '1'){
                consZeros++ ;
                 maxZeros =Math.max( maxZeros,consZeros);
            }
            else{
                consZeros =0;
            }
        }

        System.out.println(maxZeros);
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
    }
}