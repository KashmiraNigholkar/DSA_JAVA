package ConditionalStatement;

import java.util.Scanner;

public class Practise {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int x=sc.nextInt();
        if(x>0){
            System.out.println("This is positive number");
        }
        else{
            System.out.println("This is negative number");
        }

        double temp=100;
        if(temp>100){
            System.out.println("You a have fever");
        }
        else{
            System.out.println("YOu dont have fever. ");
        }

        int days=3;
        switch (days) {
            case 1:
            System.out.println("Monday");
            break;

            case 2:
            System.out.println("Tuesday");
                
                break;
            case 3:
            System.out.println("wedenesday");
            break;

            case 4:
            System.out.println("Thuesday");
            break;

            case 5:
            System.out.println("friday");
            break;
            case 6:
            System.out.println("saturday");
            break;
            case 7:
            System.out.println("sunday");
            break;

        
            default:
                System.out.println("No day is there");
        }

       
        System.out.println("Enter the Year");
        int year=sc.nextInt();
        if((year%4 ==0 && year% 100!=0) ||year %400==0){
            System.out.println(year+" is a leap year");

        }
        else{
            System.out.println(year+" is not a leap year");

        }
    }
    
}
