package Java.Array.Easy;

public class LongestCommonPrefix {

    public static String prefix(String[] x) {
        if (x == null || x.length == 0) return "";
        String prefix = x[0];
        for (int i = 1; i < x.length; i++) {
            while (!x[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty())
                    return "";
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] x = {"apple", "apricot", "ape"};
        System.out.println("The common prefix is: " + prefix(x));
    }
}
