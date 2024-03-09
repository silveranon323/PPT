
public class swapvalues {
    public static void Swap(int a, int b) {
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("Values after Swapping" + "a= " + a + "b= " + b);
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        System.out.println("Values before Swapping" + "a= " + a + "b= " + b);
        Swap(a, b);
    }
}
