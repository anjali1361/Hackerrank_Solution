import java.util.Scanner;

class AppleAndOranges{

    private static final Scanner scanner = new Scanner(System.in);
     public static void main(String[] args) {

        String[] st = scanner.nextLine().split(" ");

        int s = Integer.parseInt(st[0]);

        int t = Integer.parseInt(st[1]);

        String[] ab = scanner.nextLine().split(" ");

        int a = Integer.parseInt(ab[0]);

        int b = Integer.parseInt(ab[1]);

        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        int[] apples = new int[m];

        String[] applesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int applesItem = Integer.parseInt(applesItems[i]);
            apples[i] = applesItem;
        }

        int[] oranges = new int[n];

        String[] orangesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int orangesItem = Integer.parseInt(orangesItems[i]);
            oranges[i] = orangesItem;
        }

        countApplesAndOranges(s, t, a, b, apples, oranges);

        scanner.close();
    
        
    }

    public static void countApplesAndOranges(int s,int t,int m,int n,int apple[],int oranges[]) {

        int countApple =0;
        int countOrages =0;

        for(int a=0;a<apple.length;a++){
            if((m+apple[a]<=t) && (m+apple[a]>=s)){
                countApple++;
            }
        }

        for(int b =0;b<oranges.length;b++){
            if((n+oranges[b]<=t) && (n+oranges[b]>=s)){
                countOrages++;
            }
        }

        System.out.println(countApple);

        System.out.println(countOrages);
        
    }
}