import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner=new Scanner(System.in);
       int d1=scanner.nextInt();
       int m1=scanner.nextInt();
       int y1=scanner.nextInt();
int d2=scanner.nextInt();
int m2=scanner.nextInt();
int y2=scanner.nextInt();
int fine=0;
if(y1>y2)
fine=10000;
else if(y1==y2)
{
    if(m1>m2)
    fine=500*(m1-m2);
    else if(m1==m2&&d1>d2)
    fine=15*(d1-d2);
}
System.out.println(fine);

    }
}
