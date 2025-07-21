public class DeleteLeftNodesWithValueAsX {

    static class Node {
        int data;
        Node left, right;
    }

    static Node newNode(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.left = null;
        newNode.right = null;
        return newNode;
    }

    // Function to delete leaf nodes with value x
    static Node deleteLeaves(Node root, int x) {
        if (root == null) {
            return null;
        }

        // Recurse on left and right children
        root.left = deleteLeaves(root.left, x);
        root.right = deleteLeaves(root.right, x);

        // If current node is a leaf and has value x, delete it
        if (root.data == x && root.left == null && root.right == null) {
            return null;
        }

        return root;
    }

    // Inorder traversal
    static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    // Main method
    public static void main(String[] args) {
        Node root = newNode(10);
        root.left = newNode(3);
        root.right = newNode(10);
        root.left.left = newNode(3);
        root.left.right = newNode(1);
        root.right.right = newNode(3);
        root.right.right.left = newNode(3);
        root.right.right.right = newNode(3);

        System.out.println("Inorder traversal before deletion:");
        inOrder(root);

        root = deleteLeaves(root, 3);

        System.out.println("\nInorder traversal after deleting leaf nodes with value 3:");
        inOrder(root);
    }
}
