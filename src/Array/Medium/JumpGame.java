package Array.Medium;

import java.util.Arrays;

public class JumpGame {

    public static boolean jumpy(int[] nums) {
        System.out.println("Starting Array: " + Arrays.toString(nums));
        int maxjump = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > maxjump) {
                return false;
            }
            maxjump = Math.max(maxjump, i + nums[i]);
            if (maxjump >= nums.length - 1) {
                return true;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};
        boolean newLength = jumpy(nums);
        System.out.println(newLength);
    }
}
