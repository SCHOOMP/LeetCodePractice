package Java.BitMinipulation.Easy; // Fixed package naming convention

import java.util.Arrays;

public class AddBinary {

    public static String addBits(String a, String b) {
        int intA = Integer.parseInt(a, 2);
        int intB = Integer.parseInt(b, 2);
        int kindaAnswer = (intA + intB);
        String answer = Integer.toBinaryString(kindaAnswer);
        return answer;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        String a = "11";
        String b = "1";
        System.out.println("First Strings " + a + " " + b);
        System.out.println("Final Answer :" + addBits(a, b));

    }
}
