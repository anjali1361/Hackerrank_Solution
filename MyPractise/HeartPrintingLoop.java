public class HeartPrintingLoop {

    public static void heart(int c) {

        int b,a;
        // for the apex of the heart
        for ( a = c / 2; a <= c; a = a + 2) {

            // for space before peak 1
            for (b = 1; b <= c - a; b = b + 2) {
                System.out.print(" ");
            }
            // for printing peak- part 2
            for (b = 1; b <= a; b++) {
                System.out.print("A");
            }

           // for space between peak1 and peak2

            for (b = 1; b <= c - a; b++) {
                System.out.print(" ");
            }

            // for printing peak- part 4
            for (b = 1; b <= a - 1; b++) {
                System.out.print("A");
            }

            System.out.print("\n");

        }

        for( a= c;a>=0;a--){
            //for space before the inverted triangle
            for(b=a;b<c;b++){
                System.out.print(" ");

            }

            for(b=1;b<=((a*2) -1);b++){
                System.out.print("B");
            }
            System.out.print("\n");
        }

    }

    public static void main(String[] args) {

        int size = 11;
        heart(size);

    }
}