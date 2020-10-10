import java.util.*;
import java.io.*;

class Solution8{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        Map<String,Integer> abc = new HashMap<>();
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            abc.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if(abc.containsKey(s)){
                System.out.println(s+"="+abc.get(s));
            }
            else{
                System.out.println("Not found");
            }
        }
        in.close();
    }
}