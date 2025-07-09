package LinkedList.Practise;

public class DeleteNNodesAfterMNodesOfLinkedList {
    
    static class Node {
        int data;
        Node next;
    }

    // Function to push a new node to the front
    static Node push(Node head_ref, int new_data) {
        Node new_node = new Node();
        new_node.data = new_data;
        new_node.next = head_ref;
        head_ref = new_node;
        return head_ref;
    }

    // Function to print the linked list
    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Function to skip M nodes and delete N nodes
    static void skipMdeleteN(Node head, int M, int N) {
        Node curr = head;
        int count;

        while (curr != null) {
            // Skip M nodes
            for (count = 1; count < M && curr != null; count++)
                curr = curr.next;

            // If we've reached the end, break
            if (curr == null)
                return;

            // Start deleting N nodes
            Node t = curr.next;
            for (count = 1; count <= N && t != null; count++) {
                t = t.next;
            }

            // Link the M-th node to the node after the deleted ones
            curr.next = t;
            curr = t;
        }
    }

    // Main method
    public static void main(String args[]) {
        Node head = null;
        int M = 2, N = 3;

        // Creating the linked list: 1->2->3->...->10
        for (int i = 10; i >= 1; i--) {
            head = push(head, i);
        }

        System.out.printf("M = %d, N = %d\nLinked List before deletion:\n", M, N);
        printList(head);

        skipMdeleteN(head, M, N);

        System.out.println("\nLinked List after deletion:");
        printList(head);
    }
}
