class Solution {
    public boolean stoneGameIX(int[] stones) {
        int[] count = new int[3];
        for (int s : stones) {
            count[s % 3]++;
        }

        // If count[0] is even, Alice wins if both count[1] and count[2] are non-zero
        // If count[0] is odd, Alice wins if the absolute difference between count[1] and count[2] is greater than 2
        if (count[0] % 2 == 0) {
            return count[1] > 0 && count[2] > 0;
        } else {
            return Math.abs(count[1] - count[2]) > 2;
        }
    }
}
