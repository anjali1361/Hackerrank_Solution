import java.util.*;

class Printer <T> {
  
    static <T> void printArray(T[] element){
        for(int i=0;i<=element.length;i++){
          System.out.println(element[i]);
        }  
    }

}

public class Generics {
    
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] intArray = new Integer[n];
        for (int i = 0; i < n; i++) {
            intArray[i] = scanner.nextInt();
        }

        n = scanner.nextInt();
        String[] stringArray = new String[n];
        for (int i = 0; i < n; i++) {
            stringArray[i] = scanner.next();
        }

        scanner.close();
        
        // Printer<Integer> intPrinter = new Printer<Integer>();
        // Printer<String> stringPrinter = new Printer<String>();
        Printer.printArray( intArray  );
        Printer.printArray( stringArray );
        if(Printer.class.getDeclaredMethods().length > 1){
            System.out.println("The Printer class should only have 1 method named printArray.");
        }
    } 
}