package BinarySearchTree;

public class SearchTree {
    

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
        if (root == null) {
            return new Node(val);
        }

        if (val < root.data) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    // Inorder traversal
    public static void inorder(Node root) {
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    public static boolean search(Node root,int key){
        if(root==null){
            return false;

        }
        if(root.data==key){
            return true;

        }
        if(root.data>key){
            return search(root.left,key);

        }
        else{
            return search(root.right,key);

        }
    }

    // Main method
    public static void main(String[] args) {
        int[] values = {5, 1, 3, 4, 2, 7};
        Node root = null;

        for (int val : values) {
            root = insert(root, val);
        }

        System.out.println("Inorder Traversal of BST:");
        inorder(root);
        System.out.println();

        if (search(root, 1)){
            System.out.println("Found");
        }else{
            System.out.println("no found");
        }
    }
}


