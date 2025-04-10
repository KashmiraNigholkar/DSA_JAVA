package Loops;
import java.util.*;


public class solution {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int evenSum=0;
            int oddSum=0;
    
            System.out.println("Enter number of integers.");
            int n=sc.nextInt();
            System.out.println("Enter"+n+"integers");
            for(int i=0;i<n;i++){
                int num=sc.nextInt();
                if(num%2==0){
                    evenSum +=num;
                }
                else{
                    oddSum +=num;
                }
            }
            System.out.println("Sum of even Natural number is"+evenSum);
            System.out.println("Sum of odd Natural number is"+oddSum);
        }
        
    }
    
    

