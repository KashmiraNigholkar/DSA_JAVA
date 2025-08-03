package BinarySearchTree;

import java.util.*;

public class ConvertBSTtoBalancedBST {

    // Node class
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    // Insert method (ignores duplicates)
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

    // Preorder traversal
    public static void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // Search method
    public static boolean search(Node root, int key) {
        if (root == null) return false;
        if (root.data == key) return true;
        return key < root.data ? search(root.left, key) : search(root.right, key);
    }

    // Delete node from BST
    public static Node delete(Node root, int val) {
        if (root == null) return null;
        if (val < root.data) root.left = delete(root.left, val);
        else if (val > root.data) root.right = delete(root.right, val);
        else {
            if (root.left == null && root.right == null) return null;
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;

            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    // Find inorder successor
    public static Node findInorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    // Print values in range [k1, k2]
    public static void printInRange(Node root, int k1, int k2) {
        if (root == null) return;
        if (root.data >= k1 && root.data <= k2) {
            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2);
        } else if (root.data < k1) {
            printInRange(root.right, k1, k2);
        } else {
            printInRange(root.left, k1, k2);
        }
    }

    // Validate BST
    public static boolean isValidBST(Node root, Node min, Node max) {
        if (root == null) return true;
        if (min != null && root.data <= min.data) return false;
        if (max != null && root.data >= max.data) return false;
        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
    }

    // Mirror the BST
    public static Node mirror(Node root) {
        if (root == null) return null;
        Node temp = root.left;
        root.left = mirror(root.right);
        root.right = mirror(temp);
        return root;
    }

    // Convert sorted array to balanced BST
    public static Node CreateBst(int[] arr, int st, int end) {
        if (st > end) return null;
        int mid = (st + end) / 2;
        Node root = new Node(arr[mid]);
        root.left = CreateBst(arr, st, mid - 1);
        root.right = CreateBst(arr, mid + 1, end);
        return root;
    }

    // Get inorder traversal into a list
    public static void getInorder(Node root, ArrayList<Integer> inorder) {
        if (root == null) return;
        getInorder(root.left, inorder);
        inorder.add(root.data);
        getInorder(root.right, inorder);
    }

    // Create a balanced BST from a sorted inorder list
    public static Node createBST(ArrayList<Integer> inorder, int st, int end) {
        if (st > end) return null;
        int mid = (st + end) / 2;
        Node root = new Node(inorder.get(mid));
        root.left = createBST(inorder, st, mid - 1);
        root.right = createBST(inorder, mid + 1, end);
        return root;
    }

    // Convert unbalanced BST to balanced BST
    public static Node balancedBST(Node root) {
        ArrayList<Integer> inorder = new ArrayList<>();
        getInorder(root, inorder);
        return createBST(inorder, 0, inorder.size() - 1);
    }

    // Main method
    public static void main(String[] args) {
        int[] values = {5, 3, 7, 2, 4, 6, 8};
        Node root = null;

        for (int val : values) {
            root = insert(root, val);
        }

        System.out.println("Inorder Traversal of BST:");
        inorder(root);
        System.out.println();

        // Search test
        System.out.println(search(root, 4) ? "Found 4" : "4 Not Found");

        // Delete a node not in the tree
        root = delete(root, 10);
        System.out.println("After deleting 10 (not in tree):");
        inorder(root);
        System.out.println();

        // Delete an existing node
        root = delete(root, 3);
        System.out.println("After deleting 3:");
        inorder(root);
        System.out.println();

        System.out.println("Values in range [4, 7]:");
        printInRange(root, 4, 7);
        System.out.println();

        // Validate BST
        System.out.println(isValidBST(root, null, null) ? "Tree is a Valid BST" : "Tree is NOT a Valid BST");

        // Mirror the tree
        System.out.println("Mirroring the BST:");
        root = mirror(root);
        inorder(root);
        System.out.println();

        // Convert sorted array to Balanced BST
        int[] sortedArr = {1, 2, 3, 4, 5, 6, 7};
        Node balancedRoot = CreateBst(sortedArr, 0, sortedArr.length - 1);
        System.out.println("Preorder Traversal of Balanced BST from sorted array:");
        preorder(balancedRoot);
        System.out.println();

        // Balance an existing unbalanced BST
        System.out.println("Balancing the original BST:");
        root = balancedBST(root);
        System.out.println("Inorder Traversal after balancing:");
        inorder(root);
        System.out.println();
    }
}
