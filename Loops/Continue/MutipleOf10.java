package Loops.Continue;
import java.util.*;

public class MutipleOf10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("enter Your Number:");
            int n=sc.nextInt();

            if(n%10==0){
                continue;
            }
            System.out.println("Number Was:"+n);
        }while(true);

    }
    
}
