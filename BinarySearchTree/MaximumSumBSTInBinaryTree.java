package BinarySearchTree;

public class MaximumSumBSTInBinaryTree {
    static class Node {
        Node left, right;
        int data;

        Node(int data) {
            this.data = data;
        }
    }

    static class Info {
        int max;
        int min;
        boolean isBST;
        int sum;

        Info(int max, int min, boolean isBST, int sum) {
            this.max = max;
            this.min = min;
            this.isBST = isBST;
            this.sum = sum;
        }
    }

    static class INT {
        int a;
    }

    // Utility function
    static Info MaxSumBSTUtil(Node root, INT maxsum) {
        if (root == null) {
            // For null nodes: treat as a valid BST with sum 0
            return new Info(Integer.MIN_VALUE, Integer.MAX_VALUE, true, 0);
        }

        Info left = MaxSumBSTUtil(root.left, maxsum);
        Info right = MaxSumBSTUtil(root.right, maxsum);

        // Check if current tree is a BST
        if (left.isBST && right.isBST && root.data > left.max && root.data < right.min) {
            int currSum = left.sum + right.sum + root.data;
            maxsum.a = Math.max(maxsum.a, currSum);

            return new Info(
                Math.max(root.data, right.max),  // max value in subtree
                Math.min(root.data, left.min),   // min value in subtree
                true,                            // is BST
                currSum                          // sum of this subtree
            );
        } else {
            // Not a BST
            return new Info(Integer.MAX_VALUE, Integer.MIN_VALUE, false, 0);
        }
    }

    public static int maxSumBST(Node root) {
        INT maxsum = new INT();
        maxsum.a = 0;
        MaxSumBSTUtil(root, maxsum);
        return maxsum.a;
    }

    // Example usage
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(4);
        root.right = new Node(3);
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.right.left = new Node(2);
        root.right.right = new Node(5);
        root.right.right.left = new Node(4);
        root.right.right.right = new Node(6);

        System.out.println("Maximum Sum BST in Binary Tree: " + maxSumBST(root));
    }
}
