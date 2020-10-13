import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        int numSwaps=0,firstElement,lastElement;int i,j;int temp;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
       
      
        for(i=1;i<n;i++)
        {   
           for(j=0;j<n-1;j++)
           {
           if(a[j]>a[j+1])
           {
               temp=a[j];
               a[j]=a[j+1];
               a[j+1]=temp;
               numSwaps++;
           }
           
           }}
           
           
       
       System.out.println("Array is sorted in "+numSwaps+" swaps.");
       System.out.println("First Element: "+a[0]) ;
       System.out.println("Last Element: "+a[n-1]);
    }
}
