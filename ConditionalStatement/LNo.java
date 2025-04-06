package ConditionalStatement;

public class LNo {
    public static void main(String args[]){
        int a=3,b=5,c=3;
        if((a>=b)&&(a>=c)){
            System.out.println("Largest is A");
        }
        else if(b>=c){
            System.out.println("Largest is B");
        }
        else{
            System.out.println("Largest is c");
        }
    }
    
}
