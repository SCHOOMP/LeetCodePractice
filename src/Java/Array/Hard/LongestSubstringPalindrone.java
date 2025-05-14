package Java.Array.Hard;

public class LongestSubstringPalindrone {
        public String longestPalindrome(String s) {
            if (s == null || s.length() < 1) return "";

            String longest = "";
            int n = s.length();

            for (int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {
                    String substring = s.substring(i, j + 1);
                    if (isPalindrome(substring) && substring.length() > longest.length()) {
                        longest = substring;
                    }
                }
            }
            return longest;
        }

        private boolean isPalindrome(String str) {
            int left = 0, right = str.length() - 1;
            while (left < right) {
                if (str.charAt(left) != str.charAt(right)) return false;
                left++;
                right--;
            }
            return true;
        }


    public static void main(String[] args) {
        LongestSubstringPalindrone solution = new LongestSubstringPalindrone();

        String input = "babad";
        String result = solution.longestPalindrome(input);

        System.out.println("Input: " + input);
        System.out.println("Longest Palindromic Substring: " + result);
    }

}
