public class factorial {
    public static int findFact(int num){
        int fact=1;
            while(num>1){
                fact*=num;
                num--;
            }
        return fact;
    }
    public static void main(String[] args) {
        int x=findFact(5);
        System.out.println(x);
    }
}
