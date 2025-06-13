package OOPS.ShalloCopy;

public class Copy {
    public static void main(String[] args) {
        // Create original object
        Student s1 = new Student();
        s1.name = "Kashmira";
        s1.roll = 435;
        s1.password = "abcd";  // Fixed the field name (case-sensitive)
        s1.marks = new int[3]; // Initialize the marks array
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 40;

        // Create a deep copy of s1
        Student s2 = new Student(s1);
        s2.password = "xyz"; // Modify password for s2
        s1.marks[2] = 100;   // Modify original object's marks

        // Print marks of s2 to verify deep copy
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]); // Should print: 100, 90, 40
        }
    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];

    // Default constructor
    Student() {
        marks = new int[3]; // Initialize the marks array
    }

    // Deep copy constructor
    Student(Student s1) {
        marks = new int[3]; // Allocate new array
        this.name = s1.name;
        this.roll = s1.roll;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i]; // Copy values
        }
    }
}
