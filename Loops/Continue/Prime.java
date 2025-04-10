package Loops.Continue;
import java.util.*;

public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=1){
            System.out.println(n+"is not  a prime");
        }
        boolean isPrime=true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                //n is multiple of i
                isPrime=false;
                break;
                // no need to check further
            }
        }
        if(isPrime==true){
            System.out.println("n is prime");
        }
        else{
            System.out.println("n is not prime");
        }

        
    }
    
}
