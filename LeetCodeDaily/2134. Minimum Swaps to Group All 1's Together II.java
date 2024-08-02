class Solution {
    public int minSwaps(int[] arr) {
        int n = arr.length;
        int one = 0; 
        for (int x : arr) one += x;
        if (one == n || one == 0) return 0; // if all are one or all are zero
        int ans = n;
        int zero = 0;
        int i;
        for (i = 0; i < one; i++) {   // first window
            zero += 1 - arr[i];
        }
        for (int j = 0; j < n; i = (i + 1) % n, j++) { 
            zero += arr[j] - arr[i];
            ans = Math.min(zero, ans);
        }
        return ans;
    }
}
