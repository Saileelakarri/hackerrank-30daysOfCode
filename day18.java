import java.io.*;
import java.util.*;

public class Solution {
    // Write your code here.
    Stack<Character> stack=new Stack<Character>();
    Queue<Character> queue=new LinkedList<Character>();
    
    void pushCharacter(char c){
        stack.push(c);
     }
     void enqueueCharacter(char c){
        queue.add(c);

        
     }
     char popCharacter()
     {
    
         
    return stack.pop();



     }
     char dequeueCharacter()
     {
return queue.remove();
     }


    public static void main(String[] args) {
