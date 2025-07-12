package Queue;

public class UsingLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        Node head = null;
        Node tail = null;

        public boolean isEmpty() {
            return head == null && tail == null;
        }

        // Add to the queue
        public void add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        // Remove from the queue
        public int remove() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            int front = head.data;
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
            }
            return front;
        }

        // Peek at the front of the queue
        public int peek() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println("Front: " + q.peek());
            q.remove();
        }
    }
}
