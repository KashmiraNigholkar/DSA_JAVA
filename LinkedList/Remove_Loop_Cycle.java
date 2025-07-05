package LinkedList;

public class Remove_Loop_Cycle {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class LinkList {
        Node head;
        Node tail;

        // Add node at beginning
        public void addFirst(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        // Add node at end
        public void addLast(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        // Print the linked list
        public void print() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }

        // Delete nth node from end
        public void DeleteNthFromEnd(int n) {
            int size = 0;
            Node temp = head;

            // Calculate size
            while (temp != null) {
                temp = temp.next;
                size++;
            }

            if (n == size) {
                head = head.next;
                return;
            }

            int indexToFind = size - n;
            Node prev = head;
            for (int i = 1; i < indexToFind; i++) {
                prev = prev.next;
            }

            prev.next = prev.next.next;
        }

        // Detect if cycle exists using Floyd's Cycle Detection
        public boolean isCycle() {
            Node slow = head;
            Node fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast) {
                    return true;
                }
            }
            return false;
        }

        // Remove loop/cycle from the linked list
        public void removeCycle() {
            Node slow = head;
            Node fast = head;
            boolean cycle = false;

            // Step 1: Detect cycle
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast) {
                    cycle = true;
                    break;
                }
            }

            if (!cycle) return;

            slow = head;

            // Special case: if cycle starts at head
            if (slow == fast) {
                while (fast.next != slow) {
                    fast = fast.next;
                }
                fast.next = null;
                return;
            }

            // Step 2: Move both pointers to find the start of the loop
            Node prev = null;
            while (slow != fast) {
                prev = fast;
                slow = slow.next;
                fast = fast.next;
            }

            // Step 3: Break the loop
            prev.next = null;
        }
    }

    // Demo to test cycle creation, detection, and removal
    public static void main(String[] args) {
        LinkList ll = new LinkList();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);

        // Creating a loop: 5 -> 2
        ll.tail.next = ll.head.next;  // cycle from node 5 to node 2

        System.out.println("Cycle exists: " + ll.isCycle()); // true
        ll.removeCycle();
        System.out.println("Cycle exists after removal: " + ll.isCycle()); // false

        ll.print(); // Should print: 1 -> 2 -> 3 -> 4 -> 5 -> null
    }
}
