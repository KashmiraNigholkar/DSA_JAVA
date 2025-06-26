package LinkedList;

public class SlowFastApproach {

    // Node class
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Linked list class
    public static class LinkList {
        Node head;
        Node tail;

        public void addFirst(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public void addLast(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        public void add(int index, int data) {
            if (index == 0) {
                addFirst(data);
                return;
            }

            Node newNode = new Node(data);
            Node temp = head;
            int i = 0;

            while (i < index - 1 && temp != null) {
                temp = temp.next;
                i++;
            }

            if (temp == null) return; // index out of bounds

            newNode.next = temp.next;
            temp.next = newNode;
        }

        public void print() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }

        public int itrSearch(int key) {
            Node temp = head;
            int i = 0;
            while (temp != null) {
                if (temp.data == key) {
                    return i;
                }
                temp = temp.next;
                i++;
            }
            return -1;
        }

        // Midpoint finder method
        public Node findMid() {
            Node slow = head;
            Node fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }
    }

    // Main method
    public static void main(String[] args) {
        LinkList ll = new LinkList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(5);
        ll.addLast(4);
        ll.add(2, 3); // Insert 3 at index 2

        ll.print();

        Node mid = ll.findMid();
        System.out.println("Middle element: " + mid.data);  // Should print 3
    }
}
