package Java.HashMap.Easy;

import java.util.HashMap;

public class WordPattern {

    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) {
            return false;
        }

        HashMap<Character, String> map = new HashMap<>();
        HashMap<String, Character> reverseMap = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];
            if (map.containsKey(c)) {
                if (!map.get(c).equals(word)) {
                    return false;
                }
            } else {
                if (reverseMap.containsKey(word)) {
                    return false;
                }
                map.put(c, word);
                reverseMap.put(word, c);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        WordPattern wp = new WordPattern();

        System.out.println(wp.wordPattern("abba", "dog cat cat dog"));
    }
}
