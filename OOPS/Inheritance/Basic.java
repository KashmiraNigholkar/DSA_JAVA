package OOPS.Inheritance;

public class Basic {
    public static void main(String[] args) {
        Fish shark=new Fish();
        shark.eat();


    }
    
}
class Animals{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}
class Fish extends Animals{
    int fins;

    void swim(){
        System.out.println("swims in water");
    }
}

