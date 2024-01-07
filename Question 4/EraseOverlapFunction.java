import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length <= 1) {
            return 0; // No overlaps if there are less than 2 intervals
        }

        // Sort the intervals by their end times in ascending order
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[1]));

        int count = 0;
        int prevEnd = intervals[0][1]; // End time of the first interval

        for (int i = 1; i < intervals.length; i++) {
            int[] current = intervals[i];
            if (current[0] < prevEnd) { // Overlap detected
                count++;
                // Keep the interval with the earlier end time
                prevEnd = Math.min(prevEnd, current[1]);
            } else {
                prevEnd = current[1]; // Update the end time for the next comparison
            }
        }

        return count;
    }
}
