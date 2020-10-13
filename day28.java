import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        ArrayList<String> names=new ArrayList<>();

        for (int NItr = 0; NItr < N; NItr++) {
            

            String firstName = scanner.next();

            String emailID = scanner.next();
            if(emailID.contains("@gmail.com"))
            {
                names.add(firstName);
            }
        }
        Collections.sort(names);
        for(String name:names){
            System.out.println(name);
        }

        scanner.close();
    }
}
