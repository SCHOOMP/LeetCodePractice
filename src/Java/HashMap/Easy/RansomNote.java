package HashMap.Easy;

import java.util.HashMap;

public class RansomNote {

    public static boolean Checker(String ransomNote, String magazine) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        int magLength = magazine.length();
        int i = 0;
        while (i < magLength) {
            char c = magazine.charAt(i);
            if (hashMap.containsKey(c)) {
                hashMap.put(c, hashMap.get(c) + 1);
            } else {
                hashMap.put(c, 1);
            }
            i++;
        }
        int noteLength = ransomNote.length();
        int j = 0;
        while (j < noteLength) {
            char c = ransomNote.charAt(j);
            if (!hashMap.containsKey(c) || hashMap.get(c) == 0) {
                return false;
            }
            hashMap.put(c, hashMap.get(c) - 1);
            j++;
        }

        return true;
    }

    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "aab";
        boolean answer = Checker(ransomNote, magazine);
        System.out.println(answer);
    }
}
