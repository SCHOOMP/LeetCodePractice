package Java.Array.Hard;

import java.util.*;

public class minimumDeletes {

    public static int minimumDeletions(String word, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        List<Integer> freqs = new ArrayList<>(map.values());
        Collections.sort(freqs);

        int minDeletions = Integer.MAX_VALUE;

        for (int i = 0; i < freqs.size(); i++) {
            int baseFreq = freqs.get(i);
            int deletions = 0;

            for (int f : freqs) {
                if (f < baseFreq) {
                    deletions += f;
                } else if (f > baseFreq + k) {
                    deletions += f - (baseFreq + k);
                }
            }

            minDeletions = Math.min(minDeletions, deletions);
        }

        return minDeletions;
    }

    public static void main(String[] args) {
        String word = "aabcaba";
        int k = 0;
        System.out.println(minimumDeletions(word, k));
    }
}
