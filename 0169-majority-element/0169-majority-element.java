class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        // Find candidate
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        // Since majority element always exists, candidate is the answer
        return candidate;
    }
}
