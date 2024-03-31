package Arrays;

public class maxsubarraysum {
    public static void maxSubArraySum(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        
        for (int i = 0; i < arr.length; i++) {
            int arrSum = 0; // Reset arrSum for each starting point i
            for (int j = i; j < arr.length; j++) {
                arrSum += arr[j];
                if (arrSum > maxSum) {
                    maxSum = arrSum;
                }
            }
        }
        System.out.println(maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        maxSubArraySum(numbers);
    }
}
