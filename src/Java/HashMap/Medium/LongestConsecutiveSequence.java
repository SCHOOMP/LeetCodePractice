package Java.HashMap.Medium;

import java.util.Arrays;
import java.util.HashMap;

public class LongestConsecutiveSequence {

    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0){
            return 0;
        }
        int maxLength = 1;
        int j = 1;
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                continue;
            }
            if (nums[i] == nums[i - 1] + 1) {
                j++;
            } else {
                maxLength = Math.max(maxLength, j);
                j = 1;
            }
        }
        return Math.max(maxLength, j);
    }


    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};
        System.out.println("The longest consecutive numbers is " + longestConsecutive(nums));
    }
}
