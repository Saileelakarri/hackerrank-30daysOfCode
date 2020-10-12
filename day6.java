import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int i,j,n;String s;
        Scanner scan=new Scanner(System.in);
        n=scan.nextInt();
        scan.nextLine();
        
        
        


        for( i=1;i<=n;i++){
           s=scan.nextLine();

        
           
               for( j=0;j<s.length();j++)
               {
                   if(j%2==0)
                   System.out.print(s.charAt(j));
               }
               System.out.print(" ");
               for(j=0;j<s.length();j++)
               {
                   if(j%2!=0)
                   System.out.print(s.charAt(j));
               }
               System.out.print("\n");

                

            

        }
    }
}
