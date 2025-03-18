package Java.Array.Easy;

public class SqrtRoot {

    public static int squareRoot(int x){
        int answer = (int) Math.sqrt(x);
        return answer;
    }
    // Leetcode wants an int not a double

    public static void main(String[] args) {
        int tester = 8;
        System.out.println("The squre root is : " + squareRoot(tester));
    }
}
