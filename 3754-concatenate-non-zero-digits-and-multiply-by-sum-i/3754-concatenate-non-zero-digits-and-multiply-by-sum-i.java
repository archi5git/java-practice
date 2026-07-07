class Solution {
    public long sumAndMultiply(int n) {
        String s = String.valueOf(n);
        StringBuilder sb = new StringBuilder();

        // Step 1: Concatenate non-zero digits
        for (char c : s.toCharArray()) {
            if (c != '0') {
                sb.append(c);
            }
        }

        // Step 2: Handle case when all digits are zero
        long x = sb.length() == 0 ? 0 : Long.parseLong(sb.toString());

        // Step 3: Compute sum of digits in x
        long sum = 0;
        for (char c : String.valueOf(x).toCharArray()) {
            sum += (c - '0');
        }

        // Step 4: Return x * sum
        return x * sum;
    }
}
