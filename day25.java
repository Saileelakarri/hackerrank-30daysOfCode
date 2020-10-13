import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. */
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i=0;i<n;i++)
        {
            int k=scanner.nextInt();
            System.out.println(isPrime(k)?"Prime":"Not prime");
        }}
    
      static  boolean isPrime(int n)
        {
        if(n<2)return false;
        else if(n==2)return true;
        else if(n%2==0)return false;
        else{
           int sqrt=(int)Math.sqrt(n);
            for(int i=3;i<=sqrt;i+=2)
            {
                if(n%i==0)
                return false;
            }
        }
        return true;
    }
}

