package Arrays;

public class OptimisedKadaneAlgorithm {
    public static int maxSubArraySum(int arr[]) {
        int maxSum = arr[0];
        int currentSum = arr[0];
        boolean allNegative = true;
        int smallestNegative = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= 0) {
                allNegative = false;
            } else if (arr[i] > smallestNegative) {
                smallestNegative = arr[i];
            }

            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        if (allNegative) {
            return smallestNegative;
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int numbers[] = { -1, -2, -3, -4 };
        int result = maxSubArraySum(numbers);
        System.out.println(result);
    }
}
