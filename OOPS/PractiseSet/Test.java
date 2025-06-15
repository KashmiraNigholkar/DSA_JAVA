class OOPS {
    static int marks;

    void set_marks(int marks) {
        OOPS.marks = marks; // Referencing static variable properly
    }
}

public class Test {
    public static void main(String[] args) {
        OOPS obj = new OOPS();  // Create instance of OOPS
        obj.set_marks(98);      // Set marks
        System.out.println(OOPS.marks);  // Print static marks
    }
}
