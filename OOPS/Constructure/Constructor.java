package OOPS.Constructure;

public class Constructor {
    public static void main(String[] args) {
        Student s1=new Student("Kashmira");
        System.out.println(s1.name);


    }
    
}
class Student{
    String name;
    int roll;

    Student (String name){
        this.name=name;
        System.out.println("Constructor is Called");

    }

}
