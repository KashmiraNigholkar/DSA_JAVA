package Queue;
import java.util.*;

public class StackAndQueueUsingDeque {
    Deque<Integer> deque = new LinkedList<>();

    public void push(int data) {
        deque.addLast(data);  // behaves like stack push
    }

    public int pop() {
        if (deque.isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }
        return deque.removeLast();  // behaves like stack pop
    }

    public int peek() {
        if (deque.isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }
        return deque.getLast();  // behaves like stack peek
    }

    public static void main(String[] args) {
        StackAndQueueUsingDeque stack = new StackAndQueueUsingDeque();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("peek = " + stack.peek());  // Should print 3
        System.out.println("pop = " + stack.pop());    // Should print 3
        System.out.println("peek after pop = " + stack.peek()); // Should print 2
    }
}
