package Arrays;

public class ReverseanArray {
    public static int[] reverseAnArray(int arr[]) {
        int first = 0, last = arr.length - 1;

        while (first < last) {
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;
            first++;
            last--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[5000];
        for (int i = 0; i < 5000; i++) {
            arr[i] = i + 1;
        }
        int result[] = reverseAnArray(arr);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
