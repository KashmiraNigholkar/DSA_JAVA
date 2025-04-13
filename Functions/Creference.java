class Dog{
    String name;


    Dog (String name){
        this.name=name;

    }
}


public class Creference {
    public static void ChangeDogName(Dog dog,String newName){
        dog.name=newName;
        dog=new Dog("fido");

    }
    public static void main(String[] args) {
        Dog myDog=new Dog("Buddy");
        System.out.println("Before:"+myDog.name);
        ChangeDogName (myDog,"max");
        System.out.println("After:"+ myDog.name);

    }

    
}
