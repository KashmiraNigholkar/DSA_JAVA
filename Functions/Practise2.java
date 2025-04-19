
import java.util.Scanner;
public class Practise2 {
    public static void main(String args[]){
        
        System.out.println("Please Enter the number");
        Scanner sc=new Scanner(System.in);
        
        int Palindrome=sc.nextInt();
        if(isPalindrome (Palindrome)){
            System.out.println("Number:"+Palindrome +"is a palindrome");
        }
        else{
            System.out.println("Number :"+Palindrome+"is not a palindrome");
        }

        

    }
    public static boolean isPalindrome(int number){
        int palindrome=number;
        int reverse=0;

        while (palindrome !=0) {
            int remainder=palindrome %10;
            reverse =reverse*10+remainder;
            palindrome =palindrome /10;

            
        }
        if(number==reverse){
            return true;

        }
        return false;
    }
    
}
