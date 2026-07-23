import java.util.*;

class Solution {

    public int[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {

        // Store value and original index
        int[][] nodes = new int[n][2];

        for (int i = 0; i < n; i++) {
            nodes[i][0] = nums[i];
            nodes[i][1] = i;
        }

        Arrays.sort(nodes, (a, b) -> Integer.compare(a[0], b[0]));

        int[] sortedValues = new int[n];
        int[] position = new int[n];

        for (int i = 0; i < n; i++) {
            sortedValues[i] = nodes[i][0];
            position[nodes[i][1]] = i;
        }

        int[] next = new int[n];
        int right = 0;

        for (int left = 0; left < n; left++) {

            if (right < left)
                right = left;

            while (right + 1 < n &&
                    sortedValues[right + 1] - sortedValues[left] <= maxDiff) {
                right++;
            }

            next[left] = right;
        }

        int LOG = 1;
        while ((1 << LOG) <= n)
            LOG++;

        int[][] jump = new int[LOG][n];

        for (int i = 0; i < n; i++)
            jump[0][i] = next[i];

        for (int k = 1; k < LOG; k++) {
            for (int i = 0; i < n; i++) {
                jump[k][i] = jump[k - 1][jump[k - 1][i]];
            }
        }

        int[] ans = new int[queries.length];

        for (int q = 0; q < queries.length; q++) {

            int u = position[queries[q][0]];
            int v = position[queries[q][1]];

            if (u == v) {
                ans[q] = 0;
                continue;
            }

            if (u > v) {
                int temp = u;
                u = v;
                v = temp;
            }

            int cur = u;
            int edges = 0;

            for (int k = LOG - 1; k >= 0; k--) {

                int nxt = jump[k][cur];

                if (nxt < v && nxt > cur) {
                    cur = nxt;
                    edges += (1 << k);
                }
            }

            if (jump[0][cur] >= v)
                ans[q] = edges + 1;
            else
                ans[q] = -1;
        }

        return ans;
    }
}