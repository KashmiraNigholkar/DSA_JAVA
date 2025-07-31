package BinarySearchTree;

public class IsBST {
    
    // Node class for the binary tree
    static class Node {
        int data;
        Node left, right;

        Node(int val) {
            this.data = val;
            this.left = null;
            this.right = null;
        }
    }

    // Class that checks if a binary tree is a BST
    

        public boolean isBST(Node root) {
            return check(root, Long.MIN_VALUE, Long.MAX_VALUE);
        }

        private boolean check(Node node, long min, long max) {
            if (node == null) return true;

            if (node.data <= min || node.data >= max) return false;

            return check(node.left, min, node.data) &&
                   check(node.right, node.data, max);
        }
    

    public static void main(String[] args) {
        // Constructing the tree: [2, 1, 3, N, N, N, 5]
        Node root = new Node(2);
        root.left = new Node(1);
        root.right = new Node(3);
        root.right.right = new Node(5);

        IsBST validator = new IsBST();
        boolean result = validator.isBST(root);

        System.out.println("Is the tree a BST? " + result); // Output: true
    }
}

    

