import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        int[][] arr = new int[6][6];
        int max_sum=Integer.MIN_VALUE;int sum=0;int i,j;
        for (i =0 ; i<6; i++) {
            

            for (j = 0; j < 6; j++) {
                arr[i][j]=scanner.nextInt();
            }
            

        }
        
for(i=0;i<4;i++)
{
    for(j=0;j<4;j++)
    {
 sum=(arr[i][j]+arr[i][j+1]+arr[i][j+2]
     +arr[i+1][j+1]
     + arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2]);
     if(sum>max_sum)
     max_sum=sum;
    
} 

}
    
    scanner.close();
    
    System.out.println(max_sum);
}}

