package Medium;

import java.util.Arrays;

public class RemoveDuplicatesII {

    public static int removeDups(int[] nums) {
        System.out.println("Starting Array: " + Arrays.toString(nums));
        int index = 1;
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                count = 1;
            }
            if (count <= 2) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int newLength = removeDups(nums);
        System.out.println("New Length: " + newLength);
        System.out.println("Modified Array: " + Arrays.toString(Arrays.copyOf(nums, newLength)));
    }
}
