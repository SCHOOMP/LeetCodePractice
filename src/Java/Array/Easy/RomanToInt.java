package Array.Easy;

public class RomanToInt {

    public static int conversion(String s) {
        char[] sArray = s.toCharArray();
        int counter = 0;

        for (int i = 0; i < sArray.length; i++) {
            char current = sArray[i];
            char next = (i + 1 < sArray.length) ? sArray[i + 1] : ' ';

            if (current == 'I' && (next == 'V' || next == 'X')) {
                counter -= 1;
            } else if (current == 'I') {
                counter += 1;
            }
            else if (current == 'X' && (next == 'L' || next == 'C')) {
                counter -= 10;
            } else if (current == 'X') {
                counter += 10;
            }
            else if (current == 'C' && (next == 'D' || next == 'M')) {
                counter -= 100;
            } else if (current == 'C') {
                counter += 100;
            }
            else if (current == 'V') {
                counter += 5;
            }
            else if (current == 'L') {
                counter += 50;
            }
            else if (current == 'D') {
                counter += 500;
            }
            else if (current == 'M') {
                counter += 1000;
            }
            System.out.println(sArray[i]);
        }
        return counter;
    }

    public static void main(String[] args) {
        String s = "MCMXCIV";
        int answer = conversion(s);
        System.out.println(answer);
    }
}
