package Arrays;

public class leftrotate {
    public static int[] leftrotate_1(int arr[], int n) {
        int temp = arr[0];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n - 1] = temp;
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int rotatedArr[] = leftrotate_1(arr, arr.length);
        for (int num : rotatedArr) {
            System.out.print(num + " ");
        }
    }
}
