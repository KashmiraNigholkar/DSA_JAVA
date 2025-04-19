
import java.util.Scanner;
public class Practise {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Input 1st number:");
        double x=sc.nextInt();
        System.out.println("Input 2nd number:");
        double y=sc.nextInt();
        System.out.println("Input 2nd number:");
        double z=sc.nextInt();
        System.out.println("The average value is "+average (x,y,z)+"\n");
    }
    public static double average(double x,double y,double z){
        return (x+y+z)/3;
        
    }
    
}
