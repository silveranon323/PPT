class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int summ = 0;
        int maxSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                summ++;
                maxSum = Math.max(maxSum, summ);
            } else {
                summ = 0;
            }
        }
        return maxSum;
    }
}
