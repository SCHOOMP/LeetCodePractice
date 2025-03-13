package Java.SlidingWindow.Medium;


public class MinSubArray {

    public static int minSubArrayLen(int target, int[] nums) {
        int minLength = 0;
        int sum = 0;
        int left = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            while (sum >= target) {
                if (minLength == 0 || i - left + 1 < minLength) {
                    minLength = i - left + 1;
                }
                sum -= nums[left];
                left++;
            }
        }

        return minLength;
    }

    public static void main(String[] args) {
        int target = 7;
        int[] nums = {2,3,1,2,4,3};
        int answer = minSubArrayLen(target, nums);
        System.out.println(answer);
    }
}
