package Java.Array.Hard;

public class MirrorPairs {

    public static int mirrorCounter(int N, String S){
        int[] freq = new int[26];

        for (int i = 0; i < N; i++) {
            freq[S.charAt(i) - 'a']++;
        }

        int result = 0;

        // Check mirror pairs: a↔z, b↔y, c↔x, ..., m↔n
        for (int i = 0; i < 13; i++) {
            int left = i;          // a=0, b=1, c=2, ...
            int right = 25 - i;    // z=25, y=24, x=23, ...
            result += freq[left] * freq[right];
        }

        return result;
    }

    public static void main(String[] args) {
        String n = "aabzz";
        System.out.println("The amount of mirror pairs is " + mirrorCounter(n.length(), n));
    }
}
