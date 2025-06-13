package OOPS;

public class Constructor {
    public static void main(String[] args) {
        Horse h=new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);;

    }
    
}

abstract class Animal{
    String color;

    Animal(){
        color="brown";

    }
    void eat(){
        System.out.println("Animal eats");
    }
    abstract void walk();

}
class Horse extends Animal{
    void changeColor(){
        color="dark brown ";

    }
    void walk(){
        System.out.println("Walks on 4 legs");
    }
    
}

