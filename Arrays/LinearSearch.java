package Arrays;

public class LinearSearch {
    public static int linearSearch(int arr[], int key, int sizeOfArray) {
        for (int i = 0; i < sizeOfArray; i++) {
            if (arr[i] == key) {
                return i;
            }

        }
        return -1;

    }

    public static void main(String[] args) {
        int numbers[] = { 1, 2, 2, 4, 5, 6, 7, 8, 9, 10 };
        int searchElement = 7;
        int result = linearSearch(numbers, searchElement, numbers.length);
        if (result == -1) {
            System.out.println("Element is not present in the array");
        } else {
            System.out.println("The element present is at index : " + result);
        }
    }
}
