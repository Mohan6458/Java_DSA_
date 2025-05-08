package Stringss;
import java.util.Arrays;

 class ValidAnagram {
    public static boolean anagramStrings(String s, String t) {
        // If lengths are not equal, they cannot be anagrams
        if (s.length() != t.length()) return false;

        // Convert strings to char arrays and sort them
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);

        // Compare sorted arrays
        return Arrays.equals(sArray, tArray);
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        String str1 = "INTEGER";
        String str2 = "TEGERNI";
        boolean result = ValidAnagram.anagramStrings(str1, str2);
        System.out.println(result ? "True" : "False");

        
    }
}

