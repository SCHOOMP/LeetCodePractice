package Java.Array.Easy;

import java.util.*;

public class DistinctArray {
    public static int minimumOperations(int[] nums) {
        int operations = 0;
        int start = 0;
        while (start < nums.length) {
            HashSet<Integer> tempSet = new HashSet<>();
            boolean isDistinct = true;
            for (int i = start; i < nums.length; i++) {
                if (!tempSet.add(nums[i])) {
                    isDistinct = false;
                    break;
                }
            }
            if (isDistinct) break;

            operations++;
            start += 3;
        }
        return operations;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,2,3,3,5,7};
        System.out.print("the number of operations is " + minimumOperations(array));
    }

}
