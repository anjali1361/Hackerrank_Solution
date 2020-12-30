import java.util.Scanner;

public class GreatXor {
    
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);

       int q = sc.nextInt();
       for(int i=0;i<q;i++){
           long x = sc.nextLong();

           System.out.println(xor((x)));
       }

    }

    private static long xor(long x) {
        if(x>1){

            for(long a=1;a<x;a++){

                long res = a^x;
                if(res>x){
                    return a;
                }
        
            } 
        }
       
        return 0;
    }
}
