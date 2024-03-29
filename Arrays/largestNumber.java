package Arrays;

public class largestNumber {
    public static int largestnumber(int arr[]) {
        int lengthOfArray = arr.length;
        int largestNumber = Integer.MIN_VALUE;

        for (int i = 0; i < lengthOfArray; i++) {
            if (arr[i] > largestNumber) {
                largestNumber = arr[i];
            }
        }

        return largestNumber;
    }

    public static void main(String[] args) {
        int numbers[] = { -4000, 101, 2, 10, 23, 12, 14, 15, 10 };
        int result = largestnumber(numbers);
        System.out.println("The largest element that is present in this array is : " + result);
    }
}
