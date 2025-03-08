package Easy;

public class IndexoftheFirstOccurrence {

    public static int strStr(String haystack, String needle) {
        int hayLen = haystack.length();
        int needleLen = needle.length();
        for (int i = 0; i <= hayLen - needleLen; i++) {
            if (haystack.substring(i, i + needleLen).equals(needle)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        int answer = strStr(haystack, needle);
        System.out.println(answer);
    }
}
