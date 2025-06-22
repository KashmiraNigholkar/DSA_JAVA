package ArrayList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class CollectionSort {
    public static void swap(final ArrayList<Integer>list,final int idx1, final int idx2){
        final int temp=list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);

    }

    public static void main(final String[] args) {
        final ArrayList<Integer>list=new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(3);
        list.add(9);
        list.add(3);
        list.add(6);
        list.add(5);
        System.out.println(list);
        Collections.sort(list);//acsending
        System.out.println(list);

        //descending

        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);

    }

    
}
