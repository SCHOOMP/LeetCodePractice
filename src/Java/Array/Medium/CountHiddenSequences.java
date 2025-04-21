package Java.Array.Medium;

public class CountHiddenSequences {

    public static int numberOfArrays(int[] differences, int lower, int upper) {
        long current = 0;
        long min = 0;
        long max = 0;
        for (int diff : differences) {
            current += diff;
            min = Math.min(min, current);
            max = Math.max(max, current);
        }
        long startMin = lower - min;
        long startMax = upper - max;

        long count = startMax - startMin + 1;
        return (int)Math.max(0, count);
    }


    public static void main(String[] args) {
        int lower = 1;
        int upper = 6;
        int[] differences = {1,-3,4};
        int answer = numberOfArrays(differences, lower, upper);
        System.out.println(answer);

    }
}
