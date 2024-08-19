class Solution {
    public int minSteps(int n) {
       if (n == 1) return 0;
        
        int steps = 0;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            while (n % i == 0) {
                steps += i;
                n /= i;
            }
        }
        
        // If n is greater than 1, it must be prime at this point
        if (n > 1) {
            steps += n;
        }
        
        return steps;
    }
}
