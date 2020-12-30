import java.io.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {
    
    static int gcd(int x,int y){
        if(y==0) return x;
       return gcd(y,x%y);
    }
    
    static int lcm(int x,int y){
        return (x*y)/gcd(x,y);
    }

    

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        
        int a1 = a.get(0);
        int count;
        
        for(int i=1;i<a.size();i++){
            
            a1 = lcm(a1,a.get(i));
            
        }
        
        int b1 = b.get(0);
        
        for(int i=1;i<b.size();i++){
            
            b1 = gcd(b1,b.get(i));
            
        }
        
        System.out.println(a1);
        System.out.println(b1);
        
        List<Integer> res = new ArrayList<>();
        
        int temp =a1;
        while(temp<=b1){        
               
            res.add(temp);
            temp += a1;
            
        } 
        
        for(int i:res){
            if(b1%i == 0) count++;
        }

        return count;
        

    }

}

