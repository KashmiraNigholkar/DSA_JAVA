package LinkedList;

public class CircularLinkedList {

    static class Node {
        int data;
        Node next;
    }

    static Node addToEmpty(Node last, int data) {
        if (last != null)
            return last;

        Node newNode = new Node();
        newNode.data = data;
        last = newNode;
        newNode.next = last;
        return last;
    }

    static Node addFront(Node last, int data) {
        if (last == null)
            return addToEmpty(last, data);

        Node newNode = new Node();
        newNode.data = data;
        newNode.next = last.next;
        last.next = newNode;
        return last;
    }

    static Node addEnd(Node last, int data) {
        if (last == null)
            return addToEmpty(last, data);

        Node newNode = new Node();
        newNode.data = data;
        newNode.next = last.next;
        last.next = newNode;
        last = newNode;
        return last;
    }

    static Node addAfter(Node last, int data, int item) {
        if (last == null)
            return null;

        Node p = last.next;
        do {
            if (p.data == item) {
                Node newNode = new Node();
                newNode.data = data;
                newNode.next = p.next;
                p.next = newNode;

                if (p == last)
                    last = newNode;

                return last;
            }
            p = p.next;
        } while (p != last.next);

        System.out.println(item + " not found in the list.");
        return last;
    }

    static Node deleteNode(Node last, int key) {
        if (last == null)
            return null;

        // If the list has only one node
        if (last.data == key && last.next == last) {
            return null;
        }

        Node temp = last;
        Node d;

        // If the node to be deleted is the first node
        if (last.next.data == key) {
            d = last.next;
            last.next = d.next;
            return last;
        }

        // In-between or last node
        while (temp.next != last && temp.next.data != key) {
            temp = temp.next;
        }

        if (temp.next.data == key) {
            d = temp.next;
            temp.next = d.next;

            // If it was the last node
            if (d == last) {
                last = temp;
            }
        } else {
            System.out.println(key + " not found.");
        }

        return last;
    }

    static void traverse(Node last) {
        if (last == null) {
            System.out.println("List is empty.");
            return;
        }

        Node p = last.next;
        do {
            System.out.print(p.data + " ");
            p = p.next;
        } while (p != last.next);
        System.out.println();
    }

    public static void main(String[] args) {
        Node last = null;

        last = addToEmpty(last, 6);
        last = addEnd(last, 8);
        last = addFront(last, 2);
        last = addAfter(last, 10, 2);

        System.out.println("Initial Circular Linked List:");
        traverse(last);

        last = deleteNode(last, 8);

        System.out.println("After deleting 8:");
        traverse(last);
    }
}
