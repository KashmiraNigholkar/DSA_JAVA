package Recurssion;

public class SumOfNaturalNumber {
    public static int calCulateSum(int n){
    if(n==1){
        return 1;

    }
    int Snm1=calCulateSum(n-1);
    int Sn=n+Snm1;
    return Sn;
}

    public static void main(String[] args) {
        int n=7;
        System.out.println(calCulateSum(n));

    }
    
}


    

