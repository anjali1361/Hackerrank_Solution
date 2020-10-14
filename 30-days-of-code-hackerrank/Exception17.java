import java.util.*;

class Custom_Calculator1{

    public int power(int n,int p) throws Exception{
        if(n>=0 && p>=0){
            return (int)Math.pow(n,p);
        }
        else{
           throw new Exception("n and p should be non-negative");
        }
    }

}

class Exception17{

    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
        
            int n = in.nextInt();
            int p = in.nextInt();
            Custom_Calculator1 myCustom_Calculator1 = new Custom_Calculator1();
            try {
                int ans = myCustom_Calculator1.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}