public class binomialcofficient {
    public static int findFact(int num){
        int fact=1;
            while(num>1){
                fact*=num;
                num--;
            }
        return fact;
    }
    public static int binomialCofficient(int n, int r){
        int nfact=findFact(n);
        int rfact=findFact(r);
        int nrfact=findFact(n-r);
        int result=nfact/(rfact*nrfact);
    return result ;
 }
    public static void main(String[] args) {
        int n = 5,r=2;
        
        int result=binomialCofficient(n,r);
        System.out.println("The binomial coffiecient is : " + result);
    
 }   
}
 