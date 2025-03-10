package Array.Medium;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWords {
    public static String reverse(String s) {
        String[] newS = s.trim().split("\\s+");
        List<String> newnewS = Arrays.asList(newS);
        Collections.reverse(newnewS);
        return String.join(" ", newnewS);
    }

    public static void main(String[] args) {
        String s = "  hello world  ";
        System.out.println("Reversed = " + reverse(s));
    }
}
