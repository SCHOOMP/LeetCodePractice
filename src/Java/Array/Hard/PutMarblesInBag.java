package Java.Array.Hard;

import java.util.Arrays;

public class PutMarblesInBag {
    public static long putMarbles(int[] weights, int k) {
        int n = weights.length;
        if (k == 1) {
            return 0;
        }


        long[] pairCosts = new long[n - 1];
        for (int i = 0; i < n - 1; i++) {
            pairCosts[i] = (long) weights[i] + weights[i + 1];
        }
        Arrays.sort(pairCosts);
        long minScore = 0;
        for (int i = 0; i < k - 1; i++) {
            minScore += pairCosts[i];
        }
        long maxScore = 0;
        for (int i = n - 2; i >= n - k; i--) {
            maxScore += pairCosts[i];
        }
        return maxScore - minScore;
    }

    public static void main(String[] args) {
        int[] weight = {1, 3, 5, 1};
        int k = 2;
        System.out.println("The difference is: " + putMarbles(weight, k));
    }
}