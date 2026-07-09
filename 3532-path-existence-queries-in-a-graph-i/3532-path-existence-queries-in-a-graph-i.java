import java.util.*;

class Solution {
    public boolean[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {
        int[] comp = new int[n];
        comp[0] = 0;
        
        // Step 1: Build connected components
        for (int i = 1; i < n; i++) {
            if (nums[i] - nums[i - 1] <= maxDiff) {
                comp[i] = comp[i - 1]; // same component
            } else {
                comp[i] = comp[i - 1] + 1; // new component
            }
        }
        
        // Step 2: Answer queries
        boolean[] ans = new boolean[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int u = queries[i][0], v = queries[i][1];
            ans[i] = (comp[u] == comp[v]);
        }
        
        return ans;
    }
}
