public class checkprime {
    public static boolean isPrime(int num) {
      
        for (int i = 2; i < num - 1; i++) {
            if (num % i == 0) {
                return false;

            }
        }
        return true;

    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println(isPrime(num));
    }
}
