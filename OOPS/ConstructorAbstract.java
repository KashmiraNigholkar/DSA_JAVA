package OOPS;

public class ConstructorAbstract {
    public static void main(String[] args) {
        Mustang myHorse = new Mustang(); // Creating Mustang object
    }
}

abstract class Animal {
    String color;

    Animal() {
        System.out.println("Animal constructor is called");
    }

    void eat() {
        System.out.println("Animal eats");
    }

    abstract void walk(); // Abstract method to be implemented in subclass
}

class Horse extends Animal {
    Horse() {
        System.out.println("Horse constructor is called");
    }

    void changeColor() {
        color = "Dark Brown";
    }

    void walk() {
        System.out.println("Walks on 4 legs");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang constructor is called");
    }
}
