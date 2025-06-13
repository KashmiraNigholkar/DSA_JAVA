package OOPS.Inheritance.TypesOfInheritance;

public class Multilevel {
    public static void main(String[] args) {
        Dog dobby=new Dog();
        dobby.eat();
        dobby.legs=4;
        System.out.println(dobby.legs);
    }
    
}
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}
class mammals extends Animal{
    int legs;

}
class Dog extends Animal{
    int legs;
    String eat;

}