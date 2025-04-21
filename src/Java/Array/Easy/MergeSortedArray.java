package Java.Array.Easy;

import java.util.Arrays;

public class MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }
        Arrays.sort(nums1);
    }


    public static void main(String[] args) {
        // Example to test the merge method
        int[] nums1 = {1,2,5,0,0,0};
        int[] nums2 = {1, 2, 3};

        int m = 3;
        int n = 3;

        merge(nums1, m, nums2, n);

        // Print the merged array
        System.out.print("Merged Array: ");
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
}
