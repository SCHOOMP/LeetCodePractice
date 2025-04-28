package Java.Array.Easy;

import java.util.ArrayList;
import java.util.Arrays;

public class MissingNumber {

    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return nums.length;
    }


    public static void main(String[] args) {
        int[] nums = {1,2};
        System.out.println("Missing Num : " + missingNumber(nums));
    }
}
