package FunctionOverloading.DataType;

public class Boolean1 {
    public static boolean isPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n==2){
                return false;

            }

        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(60));
    }
    
}
