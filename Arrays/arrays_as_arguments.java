package Arrays;
//arrays are pass as an arguments as by reference .

public class arrays_as_arguments {
    public static void update(int marks[], int temp) {
        temp = 10;
        for (int i = 0; i < marks.length; i++) {
            marks[i] += 1;
        }
    }

    public static void main(String[] args) {
        int marks[] = { 97, 98, 99 };
        int temp = 6;
        update(marks, 6);

        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println(temp);

    }
}
