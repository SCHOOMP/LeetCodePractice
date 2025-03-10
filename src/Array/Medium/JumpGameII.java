package Array.Medium;

import java.util.Arrays;

public class JumpGameII {

    public static int jumpyII(int[] nums) {
        int n = nums.length;
        System.out.println("Starting Array: " + Arrays.toString(nums));
        int jumps = 0, farthest = 0, currentEnd = 0;
        for (int i = 0; i < n - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);
            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;
                if (currentEnd >= n - 1) return jumps;
            }
        }
        return jumps;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,0,1,4};
        int newLength = jumpyII(nums);
        System.out.println(newLength);
    }
}
