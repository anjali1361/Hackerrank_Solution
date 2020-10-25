package Bit_Manipulation;

import java.io.*;
import java.util.*;

public class MaximizeInteger {

    // Complete the maximizingXor function below.
    static int maximizingXor(int l, int r) {

      int res;
      int xor = l^r;

      int significantBit = 31- Integer.numberOfLeadingZeros(xor);

       res = (1 << (significantBit + 1)) - 1;

      return res;

    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int l = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int r = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = maximizingXor(l, r);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

