package Java.Array.Medium;

import java.util.Arrays;

public class TrippleIndices {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count = 0;
        int n = arr.length;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (Math.abs(arr[i] - arr[j]) <= a &&
                            Math.abs(arr[j] - arr[k]) <= b &&
                            Math.abs(arr[i] - arr[k]) <= c) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        TrippleIndices obj = new TrippleIndices();
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int a = 1, b = 1, c = 1;
        System.out.println("Number of good triplets: " + obj.countGoodTriplets(nums, a, b, c));
    }
}
