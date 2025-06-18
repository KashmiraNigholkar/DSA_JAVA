package Recurssion;

public class OptimizedPower {
    public static int OptimizedPower(int a, int n){
        if(n==0){
            return 1;

        }
        int halfPowerSq=OptimizedPower(a,n/2) * OptimizedPower(a,n/2);
        if(n%2 !=0){
            halfPowerSq =a * halfPowerSq;

        }
        return halfPowerSq;


        
    }
    public static void main(String args[]){
        int a=2;
        int n=5;
        System.out.println(OptimizedPower(a, n));
    }
    
}
