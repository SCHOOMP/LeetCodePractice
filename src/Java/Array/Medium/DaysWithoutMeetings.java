package Java.Array.Medium;

import java.util.*;

public class DaysWithoutMeetings {
    public static int countDays(int days, int[][] meetings) {
        Set<Integer> uniqueDays = new HashSet<>();

        for (int i = 0; i < meetings.length; i++) {
            int start = meetings[i][0];
            int end = meetings[i][1];
            for (int day = start; day <= end; day++) {
                uniqueDays.add(day);
            }
        }

        System.out.println(uniqueDays);

        return days - uniqueDays.size();
    }

    public static void main(String[] args) {
        int days = 10;
        int[][] meetings = {{5, 7}, {1, 3}, {9, 10}, {5, 6}};

        int result = countDays(days, meetings);
        System.out.println("Available work days: " + result);
    }
}
