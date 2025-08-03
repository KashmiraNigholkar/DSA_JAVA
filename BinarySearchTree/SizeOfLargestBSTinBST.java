package BinarySearchTree;

import java.util.*;

public class SizeOfLargestBSTinBST {

    // Node class
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    // Insert method
    public static Node insert(Node root, int val) {
        if (root == null) return new Node(val);
        if (val < root.data) root.left = insert(root.left, val);
        else if (val > root.data) root.right = insert(root.right, val);
        return root;
    }

    // Inorder traversal
    public static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Other tree methods skipped for brevity (same as yours)...

    // Class to hold information about subtree
    static class Info {
        boolean isBST;
        int size;
        int min;
        int max;

        Info(boolean isBST, int size, int min, int max) {
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }

    // Variable to store the size of the largest BST
    public static int maxBST = 0;

    // Function to find the size of the largest BST in a binary tree
    public static Info largestBST(Node root) {
        if (root == null) {
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }

        Info leftInfo = largestBST(root.left);
        Info rightInfo = largestBST(root.right);

        int size = leftInfo.size + rightInfo.size + 1;
        int min = Math.min(root.data, Math.min(leftInfo.min, rightInfo.min));
        int max = Math.max(root.data, Math.max(leftInfo.max, rightInfo.max));

        if (leftInfo.isBST && rightInfo.isBST && root.data > leftInfo.max && root.data < rightInfo.min) {
            maxBST = Math.max(maxBST, size);
            return new Info(true, size, min, max);
        }

        return new Info(false, size, min, max);
    }

    // Main method
    public static void main(String[] args) {
        /*
            Manually building a tree to include a subtree that is not a BST,
            for better demonstration.
            
                   5
                 /   \
                2     10
                     /  \
                    6    12
                   /
                  1   <- This node breaks the BST property
        */

        Node root = new Node(5);
        root.left = new Node(2);
        root.right = new Node(10);
        root.right.left = new Node(6);
        root.right.right = new Node(12);
        root.right.left.left = new Node(1); // breaks BST property

        System.out.println("Inorder traversal of the tree:");
        inorder(root);
        System.out.println();

        largestBST(root);
        System.out.println("Size of the largest BST in the binary tree: " + maxBST);
    }
}
