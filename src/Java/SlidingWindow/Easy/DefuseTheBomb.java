package Java.SlidingWindow.Easy;

import java.util.Arrays;

public class DefuseTheBomb {

    public static int[] decrypt(int[] code, int k) {
        int[] result = new int[code.length];
        if (k == 0){
            Arrays.fill(result, 0);
            return result;
        }
        for (int i = 0; i < code.length; i++){
            int sum = 0;
            if (k > 0) {
                for (int j = 1; j <= k; j++) {
                    sum += code[(i + j) % code.length];
                }
            } else {
                for (int j = 1; j <= -k; j++) {
                    sum += code[(i - j + code.length) % code.length];
                }
            }
            result[i] = sum;
        }

        return result;
    }


    public static void main(String[] args) {
        int[] nums = {5,7,1,4};
        int k = 3;
        System.out.println("Defuse the Bomb: " + Arrays.toString(decrypt(nums, k)));
    }
}
