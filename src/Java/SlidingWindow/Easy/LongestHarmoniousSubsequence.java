package Java.SlidingWindow.Easy;

import java.util.HashMap;

public class LongestHarmoniousSubsequence {

    public static int findLHS(int[] nums) {
        HashMap <Integer, Integer> map = new HashMap<>();
        int maxLen = 0;
        for (int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        System.out.println(map);
        for (int key : map.keySet()) {
            if (map.containsKey(key + 1)) {
                maxLen = Math.max(maxLen, map.get(key) + map.get(key + 1));
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] problem = {3,2,2,5,2,3,7};
        System.out.println("The Longest Subsequence is " + findLHS(problem));
    }
}
