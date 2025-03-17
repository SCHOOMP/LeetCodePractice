package Java.Array.Medium; // Fixed package naming convention

import java.util.Arrays;

public class ProductOfArray {

    public static int[] productCalculator(int[] nums) {
        int[] answerArray = new int[nums.length];
        int prefix = 1;
        for (int i = 0; i < nums.length; i++) {
            answerArray[i] = prefix;
            prefix *= nums[i];
        }
        int suffix = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            answerArray[i] *= suffix;
            suffix *= nums[i];
        }
        return answerArray;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println("Beginning Array: " + Arrays.toString(nums));
        System.out.println("Final Array: " + Arrays.toString(productCalculator(nums)));
    }
}
