import java.util.Arrays;

class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        // Step 1: Sort by start ascending, end descending
        Arrays.sort(intervals, (a, b) -> {
            if (a[0] == b[0]) {
                return b[1] - a[1]; // larger end first
            }
            return a[0] - b[0];
        });

        // Step 2: Traverse and count uncovered intervals
        int count = 0;
        int prevEnd = 0;

        for (int[] interval : intervals) {
            if (interval[1] > prevEnd) {
                count++;
                prevEnd = interval[1];
            }
            // else: interval is covered, skip it
        }

        return count;
    }
}
