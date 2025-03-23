package Java.Array.Easy;

import java.util.Arrays;

public class RemoveDuplicates {

    public static int removeDups(int[] nums) {
        System.out.println("Starting Array: " + Arrays.toString(nums));
        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[index]) {
                index++;
                nums[index] = nums[i];
                System.out.println("Not Dupe: " + nums[i]);
            }
        }
        System.out.println("Array after duplicates removed: " + Arrays.toString(Arrays.copyOfRange(nums, 0, index + 1)));
        return index + 1;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int newLength = removeDups(nums);
        System.out.println("New Length: " + newLength);
    }
}
