package Queue;

import java.util.*;
import java.util.Queue;
public class UsingJavaCollectionFrameWorkInQueue {
    public static void main(String[] args) {
        // Queue<Integer> q = new LinkedList<>();
        // q.add(1);
        // q.add(2);
        // q.add(3);

        // while(!q.isEmpty()){
        //    System.out.println(q.peek());
        //    q.remove(); 
        // }
        Queue<Integer> q=new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }


    }

    

}
