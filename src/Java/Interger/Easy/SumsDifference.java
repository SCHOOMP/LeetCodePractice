package Java.Interger.Easy;


public class SumsDifference {

    public static int differenceOfSums(int n, int m) {
        int solution = 0;
        for (int i = 1; i < n+1; i++){
            if(i % m != 0){
                solution += i;
            }
            if (i % m == 0){
                solution -= i;
            }
        }
        return solution;
    }



    public static void main(String[] args) {
       int n = 10, m = 3;
       System.out.println(differenceOfSums(n, m));
    }
}
