package BinarySearchTree;
import java.util.*;

public class RangeofsumOfBST {

    static class Node {
        int val;
        Node left, right;
    }

    // Create new node
    static Node newnode(int item) {
        Node temp = new Node();
        temp.val = item;
        temp.left = temp.right = null;
        return temp;
    }

    static int sum = 0;

    // BFS approach to find range sum of BST
    static int rangeOfBST(Node root, int low, int high) {
        if (root == null)
            return 0;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node curr = q.poll();

            if (curr.val >= low && curr.val <= high) {
                sum += curr.val;
            }
            if (curr.left != null && curr.val > low)
                q.add(curr.left);
            if (curr.right != null && curr.val < high)
                q.add(curr.right);
        }
        return sum;
    }

    // Insert into BST
    static Node insert(Node node, int data) {
        if (node == null)
            return newnode(data);

        if (data <= node.val)
            node.left = insert(node.left, data);
        else
            node.right = insert(node.right, data);

        return node;
    }

    public static void main(String[] args) {
        Node root = null;
        root = insert(root, 10);
        root = insert(root, 5);
        root = insert(root, 15);
        root = insert(root, 3);
        root = insert(root, 7);
        root = insert(root, 18);

        int low = 7, high = 15;
        System.out.println("Range Sum = " + rangeOfBST(root, low, high));
    }
}
