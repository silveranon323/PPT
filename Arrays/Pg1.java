package Arrays;

public class Pg1 {
    public static void main(String[] args) {
        int marks[] = new int[50];
        int numbers[] = { 1, 2, 3, 4 };
        numbers[4]=5; // why error is not shown here ? --> Because in java index out of bound error is not shown during assignment due to performance optimization instead it shows error during the compile time.
        System.out.println(numbers);
    }
}
