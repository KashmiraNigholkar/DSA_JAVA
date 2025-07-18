package BinaryTrees;

public class SubTreeOfAnotherTree {

    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Function to calculate height of the tree
    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;
    }

    // Function to count the number of nodes in the tree
    public static int count(Node root) {
        if (root == null) {
            return 0;
        }
        int leftCount = count(root.left);
        int rightCount = count(root.right);
        return leftCount + rightCount + 1;
    }

    // Function to calculate diameter of the tree (O(N^2) version)
    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }
        int leftDiam = diameter(root.left);
        int rightDiam = diameter(root.right);
        int leftHt = height(root.left);
        int rightHt = height(root.right);

        int selfDiam = leftHt + rightHt + 1;
        return Math.max(selfDiam, Math.max(leftDiam, rightDiam));
    }

    // Function to check if two trees are identical
    public static boolean isIdentical(Node node, Node subRoot) {
        if (node == null && subRoot == null) {
            return true;
        }
        if (node == null || subRoot == null || node.data != subRoot.data) {
            return false;
        }
        return isIdentical(node.left, subRoot.left) && isIdentical(node.right, subRoot.right);
    }

    // Function to check if subRoot is a subtree of root
    public static boolean isSubTree(Node root, Node subRoot) {
        if (root == null) {
            return false;
        }
        if (isIdentical(root, subRoot)) {
            return true;
        }

        return isSubTree(root.left, subRoot) || isSubTree(root.right, subRoot);
    }

    // Main method with test example
    public static void main(String[] args) {
        /*
         * Tree root:
         *         1
         *       /   \
         *      2     3
         *     / \   / \
         *    4   5 6   7
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Height: " + height(root));          // Output: 3
        System.out.println("Node Count: " + count(root));       // Output: 7
        System.out.println("Diameter: " + diameter(root));      // Output: 5

        /*
         * Subtree:
         *      2
         *     / \
         *    4   5
         */
        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);

        System.out.println("Is SubTree: " + isSubTree(root, subRoot)); // Output: true
    }
}
