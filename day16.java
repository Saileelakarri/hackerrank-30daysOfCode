import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int N;
        try{
            N=Integer.parseInt(S); 
            System.out.println(N);  
        }
        catch(NumberFormatException e)
        {
System.out.println("Bad String");
        }
    }
}
