package Array.Medium;

import java.util.Arrays;

public class HIndex {
        public static int hIndex(int[] citations) {
            Arrays.sort(citations);
            int n = citations.length;
            int h = 0;
            for (int i = 0; i < n; i++) {
                int remainingPapers = n - i;
                if (citations[i] >= remainingPapers) {
                    h = remainingPapers;
                    break;
                }
            }
            return h;
        }

        public static void main(String[] args) {
            int[] citations = {3, 0, 6, 1, 5};
            System.out.println("H-Index: " + hIndex(citations));  // Output: 3
        }
    }
