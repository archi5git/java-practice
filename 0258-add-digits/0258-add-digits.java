class Solution {
    public int addDigits(int num) {
        while (num >= 10) {  // keep going until single digit
            int sum = 0;
            while (num > 0) {
                sum += num % 10;  // add last digit
                num /= 10;        // remove last digit
            }
            num = sum;  // update num with sum of digits
        }
        return num;
    }
}
