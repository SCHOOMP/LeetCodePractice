package Java.Array.Easy;

import java.util.Arrays;

public class TypeOfTriangle {

    public static String triangleType(int[] nums) {
        if (nums.length != 3) {
            return "none";
        }

        Arrays.sort(nums);
        int a = nums[0], b = nums[1], c = nums[2];

        // Triangle Inequality Theorem
        if (a + b <= c) {
            return "none";
        }

        if (a == b && b == c) {
            return "equilateral";
        } else if (a == b || b == c || a == c) {
            return "isosceles";
        } else {
            return "scalene";
        }
    }

    public static void main(String[] args) {
        int[] nums = {8, 4, 4};
        System.out.println("The type of triangle is : " + triangleType(nums));
    }
}
