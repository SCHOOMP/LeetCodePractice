package Java.BitMinipulation.Easy;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> occurances = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(occurances.containsKey(nums[i])){
                occurances.put(nums[i], occurances.getOrDefault(nums[i], 0) + 1);
            }else{
                occurances.put(nums[i], 1);
            }
        }
        return getKeyWithMinValue(occurances);
    }

    public static int getKeyWithMinValue(HashMap<Integer, Integer> map) {
        int minKey = -1;
        int minValue = Integer.MAX_VALUE;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() < minValue) {
                minValue = entry.getValue();
                minKey = entry.getKey();
            }
        }
        return minKey;
    }

    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        System.out.println("The Non-Duplicate Number is : " + singleNumber(nums));
    }
}
