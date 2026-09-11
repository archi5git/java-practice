
class Solution {
    public int totalNumbers(int[] digits) {
        int[] freq = new int[10];
        for (int d : digits) {
            freq[d]++;
        }

        int count = 0;

        // Iterate through all 3-digit numbers
        for (int num = 100; num <= 999; num++) {
            if (num % 2 != 0) continue; // must be even

            int temp = num;
            int[] need = new int[10];

            // Break number into digits
            for (int i = 0; i < 3; i++) {
                int d = temp % 10;
                need[d]++;
                temp /= 10;
            }

            // Check if digits are available
            boolean valid = true;
            for (int d = 0; d < 10; d++) {
                if (need[d] > freq[d]) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                count++;
            }
        }

        return count;
    }
}
