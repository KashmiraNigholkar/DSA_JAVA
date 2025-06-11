package OOPS.Constructure;

public class TypesofConstructor {
    public static void main(String[] args) {
        Student s1=new Student ();
        Student s2=new Student("Kashmira");
        Student s3 =new Student(123);
        System.out.println(s1.name);
        System.out.println(s1.roll);
        System.out.println(s2.name);
        System.out.println(s3.roll);
        // Student s4=new Student("Aashish",567);


        
    }
    
}
class Student {
    String name;
    int roll;

    Student (){
        System.out.println("Constructor  is called .");
    }
    Student (String name){
        this.name=name;

    }
    Student(int roll){
        this.roll=roll;

    }
}
