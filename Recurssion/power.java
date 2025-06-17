package Recurssion;

public class power {
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        int xnml=power(x,n-1);
        int xn=x *xnml;
        return xn;

    }
    public static void main(String[] args) {
        System.out.println(power(5, 10));
    }
    
}
