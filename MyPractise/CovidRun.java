import java.util.Scanner;

public class CovidRun {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int loop = (x + k) % n;
            boolean f = true;

            if (x == y) {
                System.out.println("Yes");
                continue;
            }

            while (loop != x) {
                if (loop == y) {
                    System.out.println("Yes");
                    f = false;
                    break;
                }

                loop = (loop + k) % n;
            }

            if (f) {
                System.out.println("No");
            }

        }

    }

}
