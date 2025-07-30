package BinarySearchTree;

public class CreateMirrorBST {
    

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
        if (root == null) {
            return new Node(val);
        }

        if (val < root.data) {
            root.left = insert(root.left, val);
        } else if (val > root.data) {
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
        if (root == null) return null;

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

    // Print values in a given range [k1, k2]
    public static void printInRange(Node root, int k1, int k2) {
        if (root == null) {
            return;
        }

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

    // Check if tree is a valid BST
    public static boolean isValidBST(Node root, Node min, Node max) {
        if (root == null) return true;

        if (min != null && root.data <= min.data) return false;
        if (max != null && root.data >= max.data) return false;

        return isValidBST(root.left, min, root) &&
               isValidBST(root.right, root, max);
    }

    // Mirror the BST
    public static Node mirror(Node root) {
        if (root == null) return null;

        Node temp = root.left;
        root.left = mirror(root.right);
        root.right = mirror(temp);

        return root;
    }
    public static Node createMirror(Node root){
        if(root==null){
            return null;
        }
        Node leftSubTree=createMirror(root.left);
        Node rightSubTree=createMirror(root.right);

        root.left=rightSubTree;
        root.right=leftSubTree;
        return root;

    }
    public static void preorder(Node root){
        if(root ==null){
            return;
        }
        System.out.print(root.data+"");
        preorder(root.left);
        preorder(root.right);
        
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
        if (search(root, 4)) {
            System.out.println("Found 4");
        } else {
            System.out.println("4 Not Found");
        }

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
        if (isValidBST(root, null, null)) {
            System.out.println("Tree is a Valid BST");
        } else {
            System.out.println("Tree is NOT a Valid BST");
        }

        // Mirror the tree
        System.out.println("Mirroring the BST:");
        root = mirror(root);
        inorder(root);
        System.out.println();
        /*
         
            8
          /  \
          10  5
        /     /\

        11    6  3
        
 */
root=createMirror(root);
preorder(root);
    }
}

    

