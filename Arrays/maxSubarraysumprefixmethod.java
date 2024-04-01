package Arrays;

public class maxsubarrayusingprefixsum {
    public static void prefixSum(int arr[], int n) {
        int prefix[] = new int[n];
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        prefix[0] = arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println(maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = { 1, -2, 6, -1, 3 };
        prefixSum(numbers, 5);
    }
}
