import java.util.Scanner;

public class Practise4 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Input an integer:");
        int digit=Sc.nextInt();
        System.out.println("The sum is "+sumDigits(digit));
    }
    public static int sumDigits(int n){
        int sumDigits=0;
        while(n>0){
            int lastDigit=n%10;
            sumDigits +=lastDigit;
            n /=10;

        }
        return sumDigits;
    }
    
}
