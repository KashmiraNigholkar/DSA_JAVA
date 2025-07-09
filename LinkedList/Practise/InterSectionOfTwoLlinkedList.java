package LinkedList.Practise;

public class InterSectionOfTwoLlinkedList {
    static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    public Node getIntersectionNode(Node head1, Node head2) {
        while (head2 != null) {
            Node temp = head1;
            while (temp != null) {
                if (temp == head2) {
                    return head2;
                }
                temp = temp.next;
            }
            head2 = head2.next;
        }
        return null;
    }

    public static void main(String[] args) {
        InterSectionOfTwoLlinkedList list = new InterSectionOfTwoLlinkedList();

        // Create nodes for both lists
        Node head1 = new Node(10);
        head1.next = new Node(15);
        head1.next.next = new Node(30);

        Node head2 = new Node(3);
        head2.next = head1.next;  // Making intersection at node with data = 15

        Node intersectionPoint = list.getIntersectionNode(head1, head2);

        if (intersectionPoint == null) {
            System.out.println("No Intersection Point\n");
        } else {
            System.out.println("Intersection Point: " + intersectionPoint.data);
        }
    }
}
//tc=o(m*n)
//sc=o(1)
