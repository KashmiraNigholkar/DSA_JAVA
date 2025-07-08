package LinkedList;

import java.util.LinkedList;

public class LLCollectionFramework {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(0);
        System.out.println(ll);
        //reemove
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);

    }
    
}
