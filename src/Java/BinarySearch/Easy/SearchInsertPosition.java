package Java.BinarySearch.Easy;

public class SearchInsertPosition {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        System.out.println(solution.searchInsert(nums, target));
    }
}

class Solution {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            } else if (target < nums[i]) {
                return i;
            }
        }
        return nums.length;
    }
}
