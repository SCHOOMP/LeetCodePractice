package Java.Array.Easy;

import java.util.Arrays;

public class MoveZeros {

    public static long[] moveZeroes(int[] nums) {
        int nonZeroIndex = 0; // Pointer to track position of the next non-zero element

        // Move all non-zero elements to the front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIndex] = nums[i];
                if (i != nonZeroIndex) {
                    nums[i] = 0; // Set current position to 0 if it's not the same as nonZeroIndex
                }
                nonZeroIndex++;
            }
        }
        return null;
    }


    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        System.out.println("New Array " +(Arrays.toString(moveZeroes(nums))));
    }
}
