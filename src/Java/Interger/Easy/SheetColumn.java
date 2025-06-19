package Java.Interger.Easy;

public class SheetColumn {

    public static String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--; // Adjust to 0-based index
            char letter = (char) ('a' + (columnNumber % 26));
            result.insert(0, letter); // Prepend the character
            columnNumber /= 26;
        }
        return result.toString().toUpperCase();
    }

    public static void main(String[] args) {
        System.out.println(convertToTitle(1));
    }
}
