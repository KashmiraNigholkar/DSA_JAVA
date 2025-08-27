package BinarySearchTree;
import java.util.*;

public class rangeSumOfBST {
    static class Node {
        int val;
        Node left, right;
    };

    static Node newNode(int item) {
        Node temp = new Node();
        temp.val = item;
        temp.left = temp.right = null;
        return temp;
    }

    static int rangeSumOfBST(Node root, int low, int high) {
        if (root == null)
            return 0;

        int sum = 0;
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node curr = q.poll();

            // Check if value is within range
            if (curr.val >= low && curr.val <= high) {
                sum += curr.val;
            }

            // Since it's a BST, we can prune unnecessary branches:
            if (curr.left != null && curr.val > low) {
                q.add(curr.left);
            }
            if (curr.right != null && curr.val < high) {
                q.add(curr.right);
            }
        }
        return sum;
    }

    // Example driver code
    public static void main(String[] args) {
        Node root = newNode(10);
        root.left = newNode(5);
        root.right = newNode(15);
        root.left.left = newNode(3);
        root.left.right = newNode(7);
        root.right.right = newNode(18);

        int low = 7, high = 15;
        System.out.println("Range Sum of BST = " + rangeSumOfBST(root, low, high));
    }
}
