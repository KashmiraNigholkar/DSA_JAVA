package Stack;
import java.util.Stack;

public class PalindromeLinkedList {
    public static void main(String[] args) {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(2);
        Node five = new Node(1);

        // Create linked list: 1 -> 2 -> 3 -> 2 -> 1
        one.ptr = two;
        two.ptr = three;
        three.ptr = four;
        four.ptr = five;

        boolean condition = isPalindrome(one);
        System.out.println("Palindrome: " + condition);
    }

    static boolean isPalindrome(Node head) {
        Node slow = head;
        Stack<Integer> stack = new Stack<>();

        // Push all elements onto stack
        while (slow != null) {
            stack.push(slow.data);
            slow = slow.ptr;
        }

        // Compare while popping from stack
        while (head != null) {
            int top = stack.pop();
            if (head.data != top) {
                return false;
            }
            head = head.ptr;
        }

        return true;
    }
}

class Node {
    int data;
    Node ptr;
    Node(int d) {
        data = d;
        ptr = null;
    }
}
