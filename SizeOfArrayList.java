package ArrayList;
import java.util.ArrayList;
import java.util.*;


public class SizeOfArrayList {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list.size());

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i)+"");
        }
        System.out.println();
        //Reverse
        for(int i=list.size()-1;i>=0;i--){
            System.out.println(list.get(i)+"");
        }
        System.out.println();

        //Maximum in an arraylist
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(8);


        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            if(max<list.get(i)){
                max=Math.max(max,list.get(i));

            }
        }
        System.out.println("Max Element ="+max);


    }
    
}
