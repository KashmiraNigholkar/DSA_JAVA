// Save this file as TransformToSumTree.java
public class TransformToSmTree {

    // Definition of a tree node
    static class Node {
        int data;
        Node left, right;

        Node(int val) {
            data = val;
            left = right = null;
        }
    }

    // Function to transform tree to sum tree
    public static int toSumTree(Node node) {
        if (node == null) return 0;

        // Recursively transform left and right subtrees
        int leftSum = toSumTree(node.left);
        int rightSum = toSumTree(node.right);

        // Store the old value
        int oldVal = node.data;

        // Update current node's data
        node.data = leftSum + rightSum;

        // Return the sum of old value + subtree sums to parent
        return node.data + oldVal;
    }

    // In-order traversal for displaying the tree
    public static void printInOrder(Node node) {
        if (node == null) return;
        printInOrder(node.left);
        System.out.print(node.data + " ");
        printInOrder(node.right);
    }

    public static void main(String[] args) {
        // Sample tree:
        //        10
        //       /  \
        //      -2   6
        //     / \   / \
        //    8  -4 7   5

        Node root = new Node(10);
        root.left = new Node(-2);
        root.right = new Node(6);
        root.left.left = new Node(8);
        root.left.right = new Node(-4);
        root.right.left = new Node(7);
        root.right.right = new Node(5);

        System.out.println("Inorder traversal before transformation:");
        printInOrder(root);

        toSumTree(root);

        System.out.println("\nInorder traversal after transformation to sum tree:");
        printInOrder(root);
    }
}
