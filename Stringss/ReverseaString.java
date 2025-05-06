package Stringss;

import java.util.Arrays;
import java.util.Vector;

class Solution {
    public void reverseString(Vector<Character> s) {
        //your code goes here
        int start = 0;
        int end = s.size()-1;

        while (start <end){
            char ch=s.get(start);
            
            s.set(start,s.get(end));
            s.set(end,ch);


            start++;
            end--;

        }
        return;
    }
}

class ReverseaString {

    public static void main(String[] args) {
        Vector<Character> str = 
            new Vector<>(Arrays.asList('h', 'e', 'l', 'l', 'o'));

        // Creating an instance of Solution class
        Solution sol = new Solution();

        // Function call to reverse the string
        sol.reverseString(str);

        for (char c : str) {
            System.out.print(c);
        }
        
    }
    
}
