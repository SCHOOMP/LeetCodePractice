package TwoPointers.Easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversedString = new StringBuilder(s).reverse().toString();
        return s.equals(reversedString);
    }


    public static void main(String[] args) {
        String s = "race a car";
        System.out.println(isPalindrome(s));
    }
}

