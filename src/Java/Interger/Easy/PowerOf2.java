package Java.Interger.Easy;

public class PowerOf2 {
    public static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        int n = 16;
        System.out.println("Is " + n + " a power of 2?? " + isPowerOfTwo(n));
    }
}
