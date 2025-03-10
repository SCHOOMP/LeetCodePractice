package TwoPointers.Easy;

import java.util.HashMap;

public class IsSubsequence {
    public static boolean subsequence(String shortString, String longString){
        System.out.println("Short = " + shortString);
        System.out.println("Long = " + longString);
        int shortIndex = 0;
        int longIndex = 0;
        while (shortIndex < shortString.length() && longIndex < longString.length()) {
            if (shortString.charAt(shortIndex) == longString.charAt(longIndex)) {
                shortIndex++;
            }
            longIndex++;
        }
        return shortIndex == shortString.length();
    }

    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        System.out.println(subsequence(s,t));
    }
}
