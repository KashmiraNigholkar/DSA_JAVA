package Queue;
import java.util.*;

public class StackAndQueueUsingDeque2 {
    static class Queue {
        Deque<Integer> deque = new LinkedList<>();

        public void add(int data) {
            deque.addLast(data); // Enqueue at the end
        }

        public int remove() {
            if (deque.isEmpty()) {
                throw new NoSuchElementException("Queue is empty");
            }
            return deque.removeFirst(); // Dequeue from the front
        }

        public int peek() {
            if (deque.isEmpty()) {
                throw new NoSuchElementException("Queue is empty");
            }
            return deque.getFirst(); // Peek at the front
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        System.out.println("peek = " + q.peek()); 
        System.out.println(q.remove()); 
        System.out.println(q.remove()); 
        System.out.println(q.remove()); 
        System.out.println(q.remove()); 
    }
}
