package LinkedList;

public class MergeSort {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Get middle of the linked list
    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Merge two sorted linked lists
    private Node merge(Node head1, Node head2) {
        Node dummy = new Node(-1);
        Node temp = dummy;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }

        // Append remaining nodes
        if (head1 != null) temp.next = head1;
        if (head2 != null) temp.next = head2;

        return dummy.next;
    }

    // Recursive merge sort
    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node mid = getMid(head);
        Node rightHead = mid.next;
        mid.next = null;

        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        return merge(newLeft, newRight);
    }

    // Print the linked list
    public void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Add node at beginning
    public Node addFirst(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        return newNode;
    }

    // Main method
    public static void main(String[] args) {
        MergeSort list = new MergeSort();
        Node head = null;

        // Creating linked list
        head = list.addFirst(head, 1);
        head = list.addFirst(head, 2);
        head = list.addFirst(head, 3);
        head = list.addFirst(head, 4);
        head = list.addFirst(head, 5);

        System.out.println("Original Linked List:");
        list.print(head);

        // Sorting
        head = list.mergeSort(head);

        System.out.println("Sorted Linked List:");
        list.print(head);
    }
}
