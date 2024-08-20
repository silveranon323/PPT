class Solution {
    public int stoneGameII(int[] piles) {
        int n = piles.length;
        int[][] dp = new int[n][n];  // dp[i][m]
        int[] suffixSum = new int[n];  // Suffix sum from index i to the end
        
        suffixSum[n - 1] = piles[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffixSum[i] = suffixSum[i + 1] + piles[i];
        }
        
        return helper(0, 1, piles, dp, suffixSum);
    }
    
    private int helper(int i, int M, int[] piles, int[][] dp, int[] suffixSum) {
        int n = piles.length;
        if (i == n) return 0;  // No more piles left
        if (2 * M >= n - i) return suffixSum[i];  // Can take all remaining piles
        if (dp[i][M] > 0) return dp[i][M];  // Return previously computed result
        
        int min = Integer.MAX_VALUE;
        for (int X = 1; X <= 2 * M; X++) {
            min = Math.min(min, helper(i + X, Math.max(M, X), piles, dp, suffixSum));
        }
        
        dp[i][M] = suffixSum[i] - min;
        return dp[i][M];
    }
}
