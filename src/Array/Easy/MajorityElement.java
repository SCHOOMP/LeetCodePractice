package Array.Easy;

import java.util.Arrays;

public class MajorityElement {

    public static int MajElm(int[] nums) {
        System.out.println("Starting Array: " + Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println("Sorted Array: " + Arrays.toString(nums));
        int numsMiddle = nums.length / 2;
        return nums[numsMiddle];
    }

    public static void main(String[] args) {
        int[] nums = {3,2,3,2,2};
        int newLength = MajElm(nums);
        System.out.println("Majority Element " + newLength);
    }
}
