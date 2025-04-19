import java.util.Scanner;

public class Practise3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a=sc.nextInt();
        System.out.println("Enter the value of b");
        int b=sc.nextInt();

        int minimum =Math.min(a,b);
        System.out.println("minimum of "+a+"and" +b+"is :"+minimum);

        int maximum=Math.max(a,b);
        System.out.println("Maximum of "+a+"and"+b+"is:"+maximum);

       double squart=Math.sqrt(34);
        System.out.println("Square od "+a+ "and"+b+ "is:"+squart);

        double power=Math.pow(2,3);
        System.out.println("2 to the power 3 is :"+power);

        int negative=-15;
        int absolute=Math.abs(negative);
        System.out.println("Absolute value of "+negative+"is:"+absolute);

        double avg=(a+b)/20;
        System.out.println("Avg of "+a+ "and"+b+"is :"+avg);
        

    }
    
}
