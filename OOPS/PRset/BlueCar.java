package OOPS.PRset;

abstract class Car {
    static {
        System.out.print("1 ");  // Static block
    }

    {
        System.out.print("3 ");  // Instance initializer block
    }

    public Car(String name) {
        System.out.print("2 ");  // Constructor
    }
}

public class BlueCar extends Car {
    {
        System.out.print("4 ");  // Instance initializer block of subclass
    }

    public BlueCar() {
        super("blue");
        System.out.print("5 ");  // Constructor of subclass
    }

    public static void main(String[] args) {
        new BlueCar();
    }
}
