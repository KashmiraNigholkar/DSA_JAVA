package Loops.Break;
import java.util.*;

public class User {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        do{
            int n=sc.nextInt();
            if(n%10==0){
                break;
            }
            System.out.println("You have a enter "+ n);
        }
        while(true);
        
        
    }

    
}
