package ArrayList;
import java.util.ArrayList;
import java.util.*;


public class Opration {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        ArrayList<String>list2=new ArrayList<>();
        ArrayList<Boolean>list3=new ArrayList<>();

//add
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);


        System.out.println(list);

        //Get
        int element=list.get(2);
        System.out.println(element);

        //Delete
        list.remove(2);
        System.out.println(list);

        //set

        list.set(2,10);
        System.out.println(list);


        //contains element

        System.out.println(list.contains(1));
        System.out.println(list.contains(11));




        
    }
    
}
