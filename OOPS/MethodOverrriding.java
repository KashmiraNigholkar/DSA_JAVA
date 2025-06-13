package OOPS;

public class MethodOverrriding {
    public static void main(String[] args) {
        Deer d=new Deer();
        d.eat();

    }
    
}
class Animals{
    void eat(){
        System.out.println("eats Anything");
    }
}
class Deer extends Animals{
    void eat(){
        System.out.println("eats grass");
    }
}
