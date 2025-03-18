package Java.TwoPointers.Easy;

public class PalindromeNumber {

    public static boolean isPalindrone(int x){
        int original = x;
        int reversed = 0;
        while (original > 0){
            int lastDigit = original % 10;
            reversed = (reversed * 10) + lastDigit;
            original /= 10;
        }
        if (x == reversed){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        int test = 1231;
        System.out.println("IsPalindromeNumber: " + isPalindrone(test));
    }
}
