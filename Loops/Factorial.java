package Loops;
import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a non-negative integer:");
        int num=sc.nextInt();

        if(num <0){
            System.out.println("factorial is not defined for negative numbers.");
            return ; 
        }
        long Factorial=1;

        for(int i=1;i<=num;i++){
            Factorial *=i;
        }
        System.out.println("Factorial of"+num+"is:"+ Factorial);
    }

    
}
