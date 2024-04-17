package test.java.sessions.fabiolaMonrroy.katas.example24;

import java.util.Arrays;

public class Interval {
    public static int sumIntervals(int[][] intervals) {
        if (intervals == null || intervals.length == 0) return 0;

        // Sort intervals based on their start value
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int result = 0;
        int currentStart = intervals[0][0];
        int currentEnd = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            int nextStart = intervals[i][0];
            int nextEnd = intervals[i][1];

            // Check for overlap
            if (nextStart <= currentEnd) {
                currentEnd = Math.max(currentEnd, nextEnd);
            } else {
                result += currentEnd - currentStart;
                currentStart = nextStart;
                currentEnd = nextEnd;
            }
        }

        // Add the last interval
        result += currentEnd - currentStart;

        return result;
    }
}
