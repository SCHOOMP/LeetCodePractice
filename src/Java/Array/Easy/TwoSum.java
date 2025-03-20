package Java.Array.Easy;

import java.util.Arrays;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int[] answers = new int[2];

        for (int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++){
                if (nums[i] + nums[j] == target){
                    answers[0] = i;
                    answers[1] = j;
                }
            }
        }
        return answers;
    }


    public static void main(String[] args) {
        int[] nums = {2,5,5,11};
        int target = 10;
        System.out.println("The Two Sum to equal " + target + " is " + Arrays.toString(twoSum(nums, target)));
    }
}


