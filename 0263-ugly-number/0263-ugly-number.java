class Solution {
    public boolean isUgly(int n) {
        if (n <= 0) return false;
        
        // Divide by 2, 3, and 5 until no longer divisible
        while (n % 2 == 0) n /= 2;
        while (n % 3 == 0) n /= 3;
        while (n % 5 == 0) n /= 5;
        
        // If reduced to 1, it's ugly
        return n == 1;
    }
}
