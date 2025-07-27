package BinarySearchTree;

public class PrintinRange {
   

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

    // Search method
    public static boolean search(Node root, int key) {
        if (root == null) return false;
        if (root.data == key) return true;
        return key < root.data ? search(root.left, key) : search(root.right, key);
    }

    // Delete node from BST
    public static Node delete(Node root, int val) {
        if (root == null) return null;  // ❗ Important null check

        if (val < root.data) {
            root.left = delete(root.left, val);
        } else if (val > root.data) {
            root.right = delete(root.right, val);
        } else {
            // Node to be deleted found

            // Case 1: No children
            if (root.left == null && root.right == null) {
                return null;
            }

            // Case 2: One child
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;

            // Case 3: Two children - Find inorder successor
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }

        return root;
    }

    // Find inorder successor (smallest in right subtree)
    public static Node findInorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }
    public static void printInRange(Node root,int k1, int k2){
        if(root ==null){
         return;   
        }
if(root.data>=k1 && root.data<=k2){
    printInRange(root.left, k1, k2);
    System.out.println(root.data+"");
    printInRange(root.right, k1, k2);
}
else if(root.data<k1){
    printInRange(root.left, k1, k2);

}
    }

    // Main method
    public static void main(String[] args) {
        int[] values = {5, 1, 3, 4, 2, 7,12,11,8};
        Node root = null;

        for (int val : values) {
            root = insert(root, val);
        }

        System.out.println("Inorder Traversal of BST:");
        inorder(root);  // Should print: 1 2 3 4 5 7
        System.out.println();

        // Search test
        if (search(root, 1)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

        // Try deleting a node not in the tree
        root = delete(root, 10);  // Safe due to null check
        System.out.println("After deleting 10 (not in tree):");
        inorder(root);  // Output should remain the same
        System.out.println();

        // Delete an existing node
        root = delete(root, 3);
        System.out.println("After deleting 3:");
        inorder(root);  // 1 2 4 5 7
        printInRange(root, 5, 12);
    }
}


    

