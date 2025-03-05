package Easy;

import java.util.Arrays;

public class RemoveElement {

    public static int removeAElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int newLength = RemoveElement.removeAElement(nums, val);
        
        System.out.println("New length: " + newLength);
        System.out.println("Array after removal: " + Arrays.toString(Arrays.copyOfRange(nums, 0, newLength)));
    }
}
