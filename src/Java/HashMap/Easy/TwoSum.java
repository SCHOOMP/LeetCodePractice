package HashMap.Easy;

import java.util.Arrays;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    int[] answer = {i, j};
                    return answer;
                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] newLength = twoSum(nums, target);

        System.out.println(Arrays.toString(newLength));
    }
}

