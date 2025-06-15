package OOPS.PractiseSet;

class Student {
    String name;
    int rollNumber; // Changed from 'int name;' to avoid conflict and make sense

    // Optional: Constructor, to initialize values
    Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student("Kashmira", 101);
        System.out.println("Name: " + s.name);
        System.out.println("Roll Number: " + s.rollNumber);
    }
}
