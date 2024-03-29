package Arrays;

public class BinarySearch {
    public static int binarySearch(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                start = mid + 1; // searching in the right haLf of the array.

            } else {
                end = mid - 1; // searching in the left half
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14 };
        int key = 4;
        System.out.println("The element is present at index :  " + binarySearch(numbers, key));
    }
}
