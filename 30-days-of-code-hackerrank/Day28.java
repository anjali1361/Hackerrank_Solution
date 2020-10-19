import java.util.*;
import java.util.regex.*;

public class Day28 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        List<String> list = new ArrayList<>();

        String regex = "@gmail.com$";
        Pattern p = Pattern.compile(regex);

        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];
            String emailID = firstNameEmailID[1];
            Matcher m = p.matcher(emailID);
             if(m.find()){
            list.add(firstName);
        }
    }
        scanner.close();

        Collections.sort(list);
        for(String name:list){
            System.out.println(name);
        }

    }
}

