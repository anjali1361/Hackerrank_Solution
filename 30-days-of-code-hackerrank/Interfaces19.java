import java.util.*;

interface AdvancedArithmetic{
   int divisorSum(int n);
}
class Custom_Calculator implements AdvancedArithmetic {
    public int divisorSum(int n) {
    int sum =0;
    for(int i=1;i<=n/2;i++){
        if(n%i==0){

            sum += i;
        }
    }

    return sum += n;
    }
}

class Interfaces19{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
      	AdvancedArithmetic myCustom_Calculator = new Custom_Calculator(); 
        int sum = myCustom_Calculator.divisorSum(n);
        System.out.println("I implemented: " + myCustom_Calculator.getClass().getSimpleName() );
        System.out.println("I implemented: " + myCustom_Calculator.getClass().getName() );
        System.out.println("I implemented: " + myCustom_Calculator.getClass().getInterfaces()[0].getName() );
        System.out.println("I implemented: " + myCustom_Calculator.getClass());
        System.out.println("I implemented: " + myCustom_Calculator.getClass().getInterfaces()[0]);
        System.out.println(sum);
    }
}