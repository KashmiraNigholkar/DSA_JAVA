package OOPS.Constructure;

public class CopyConstructor {
    public static void main(String[] args) {
        Student s1 = new Student(); // Create original object
        s1.name = "Kashmira";
        s1.roll = 435;
        s1.Password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 40;

        Student s2 = new Student(s1); // Create copy using copy constructor
        s2.Password = "xyz"; // Change only password in copied object

        System.out.println("s2 name: " + s2.name);
        System.out.println("s2 roll: " + s2.roll);
        System.out.println("s2 password: " + s2.Password);

        System.out.println("s2 marks:");
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}

class Student {
    String name;
    int roll;
    String Password;
    int marks[];

    // Default constructor
    Student() {
        marks = new int[3]; // Allocate memory for marks array
    }

    // Copy constructor (deep copy)
    Student(Student s) {
        this.name = s.name;
        this.roll = s.roll;
        this.Password = s.Password;

        this.marks = new int[3];
        for (int i = 0; i < 3; i++) {
            this.marks[i] = s.marks[i]; // deep copy of array elements
        }
    }
}
