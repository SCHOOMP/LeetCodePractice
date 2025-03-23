package Java.HashMap.Easy;

import java.util.HashMap;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> charCount = new HashMap<>();

        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            if (!charCount.containsKey(c)) return false;
            charCount.put(c, charCount.get(c) - 1);
            if (charCount.get(c) == 0) {
                charCount.remove(c);
            }
        }
        return charCount.isEmpty();
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println("Is it an anagram? : " + isAnagram(s, t)); // Output: true
    }
}
