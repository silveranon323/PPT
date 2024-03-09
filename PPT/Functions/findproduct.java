public class findproduct {
    public static int findProduct(int a, int b) {
        int product = a * b;
        return product;
    }

    public static void main(String[] args) {
        int result = findProduct(5, 2);
        System.out.println("The product is " + result);
    }
}
