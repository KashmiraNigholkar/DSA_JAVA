public class BinomialCoefficient {
    public static int factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;

        }
        return f;

        

    }

    public static int BinomialCoefficient(int n,int r){
        int facto_n=factorial(n);
        int facto_r=factorial(r);
        int factorial_nmr=factorial(n-r);
        int BinomialCoefficient=facto_n/(facto_r *factorial_nmr);

        return BinomialCoefficient;
    }
    
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(BinomialCoefficient(5,2));
    }
}
