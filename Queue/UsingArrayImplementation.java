package Queue;

public class UsingArrayImplementation {
    static class Queue {
        int[] arr;
        int size;
        int rear;
        int front;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public boolean isFull() {
            return (rear + 1) % size == front;
        }

        // Add to queue (enqueue)
        public void add(int data) {
            if (isFull()) {
                System.out.println("Queue is Full.");
                return;
            }

            if (isEmpty()) {
                front = 0;
            }

            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // Remove from queue (dequeue)
        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            int result = arr[front];

            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }

            return result;
        }

        // Peek at the front of the queue
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        System.out.println("Peek: " + q.peek()); // 10
        System.out.println("Removed: " + q.remove()); // 10
        System.out.println("Removed: " + q.remove()); // 20

        q.add(60);
        q.add(70); // Should work due to circular behavior

        while (!q.isEmpty()) {
            System.out.println("Removed: " + q.remove());
        }
    }
}
