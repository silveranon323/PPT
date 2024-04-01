package Arrays;

public class kadensmaxsumofsubarray {
    public static int maxSubArraySum(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currentSum = currentSum + arr[i];
            if (currentSum < 0) {
                currentSum = 0;
            }
            maxSum= Math.max(currentSum, maxSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int numbers[] ={ 1, -2, 6, -1, 3 };
        int result = maxSubArraySum(numbers);
        System.out.println(result);
    }
}
