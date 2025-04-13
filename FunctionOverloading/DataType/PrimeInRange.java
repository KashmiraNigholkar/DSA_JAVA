package FunctionOverloading.DataType;

public class PrimeInRange {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public static void PrimeInRange(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.println(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        PrimeInRange(100);

    }
    
}
