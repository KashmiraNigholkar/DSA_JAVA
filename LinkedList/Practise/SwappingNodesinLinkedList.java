package LinkedList.Practise;

public class SwappingNodesinLinkedList {
    static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    Node head;

    // Swap nodes with values x and y
    public void swapNodes(int x, int y) {
        if (x == y)
            return;

        Node prevX = null, currX = head;
        while (currX != null && currX.data != x) {
            prevX = currX;
            currX = currX.next;
        }

        Node prevY = null, currY = head;
        while (currY != null && currY.data != y) {
            prevY = currY;
            currY = currY.next;
        }

        // If either x or y is not present, do nothing
        if (currX == null || currY == null)
            return;

        // If x is not head
        if (prevX != null)
            prevX.next = currY;
        else
            head = currY;

        // If y is not head
        if (prevY != null)
            prevY.next = currX;
        else
            head = currX;

        // Swap next pointers
        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;
    }

    // Add node at the beginning
    public void push(int new_data) {
        Node new_Node = new Node(new_data);
        new_Node.next = head;
        head = new_Node;
    }

    // Print linked list
    public void printList() {
        Node tNode = head;
        while (tNode != null) {
            System.out.print(tNode.data + " ");
            tNode = tNode.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SwappingNodesinLinkedList list = new SwappingNodesinLinkedList();
        list.push(7);
        list.push(6);
        list.push(5);
        list.push(4);
        list.push(3);
        list.push(2);
        list.push(1);

        System.out.println("Linked list before swapping 2 and 4:");
        list.printList();

        list.swapNodes(2, 4);

        System.out.println("Linked list after swapping 2 and 4:");
        list.printList();
    }
}
