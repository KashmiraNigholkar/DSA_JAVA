package OOPS.Inheritance.TypesOfInheritance;

public class Hierarchial {
    public static void main(String[] args) {
        Mammals dog = new Mammals();
        dog.walk();
        dog.eats();
        dog.breathes();

        Fish goldfish = new Fish();
        goldfish.swim();
        goldfish.eats();
        goldfish.breathes();

        Bird parrot = new Bird();
        parrot.fly();
        parrot.eats();
        parrot.breathes();
    }
}

// Parent class
class Animals {
    String color;

    void eats() {
        System.out.println("Eats");
    }

    void breathes() {
        System.out.println("Breathes");
    }
}

// Child classes inheriting from Animals
class Mammals extends Animals {
    void walk() {
        System.out.println("Walks");
    }
}

class Fish extends Animals {
    void swim() {
        System.out.println("Swims");
    }
}

class Bird extends Animals {
    void fly() {
        System.out.println("Flies");
    }
}
