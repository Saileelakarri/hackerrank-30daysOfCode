import java.util.*;
import java.io.*;
import java.util.Map;

class Solution{
    
    public static void main(String []argh){
    Map<String, Integer> hm = new HashMap<String, Integer>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            hm.put(name,phone);
            // Write code here
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(hm.containsKey(s)==false)
            System.out.println("Not found");
            else
            System.out.println(s+"="+hm.get(s));

        }
        in.close();
    }
}
