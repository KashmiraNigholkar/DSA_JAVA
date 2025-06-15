package OOPS.PractiseSet;

public class Vehicle1 {
    public static void main(String[] args) {
        Vehicle obj1 = new Car();  // Upcasting
        obj1.print();              // Will call Car's overridden print()

        Vehicle obj2 = new Vehicle();
        obj2.print();              // Will call Vehicle's print()
    }
}

class Vehicle {
    void print() {
        System.out.println("Base class (Vehicle)");
    }
}

class Car extends Vehicle {
    @Override
    void print() {
        System.out.println("Derived class (Car)");
    }
}
