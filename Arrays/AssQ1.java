package Arrays;

public class AssQ1 {
    public static boolean checkDistinct(int arr[]) {
        int count = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count += 1;
                }
            }

        }
        if (count > 0) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        int num[] = { 1, 2, 3, 4,2 };

        if (checkDistinct(num) == true) {
            System.out.println("It contains duplicate elements");
        } else {
            System.out.println("It contains distinct elements");
        }
    }
}
