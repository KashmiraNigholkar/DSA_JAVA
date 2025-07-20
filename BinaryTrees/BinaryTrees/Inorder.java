package BinaryTrees;

public class Inorder {
    public static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // Preorder traversal (Root -> Left -> Right)
    public static void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // Inorder traversal (Left -> Root -> Right)
    public static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Build tree from preorder list with -1 as null marker
    static int idx = -1;
    public static Node buildTree(int[] nodes) {
        idx++;
        if (idx >= nodes.length || nodes[idx] == -1) {
            return null;
        }

        Node newNode = new Node(nodes[idx]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);
        return newNode;
    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Node root = buildTree(nodes);

        System.out.print("Preorder Traversal: ");
        preorder(root);
        System.out.println();

        System.out.print("Inorder Traversal: ");
        inorder(root);
        System.out.println();
    }
}
