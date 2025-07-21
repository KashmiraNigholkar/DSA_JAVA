public class InvertBinarytree {

    static class Node {
        int data;
        Node left, right;

        public Node(int item) {
            data = item;
            left = right = null;
        }
    }

    Node root;

    void mirror() {
        root = mirror(root);
    }

    Node mirror(Node node) {
        if (node == null) {
            return node;
        }

        // Recur on left and right subtrees
        Node left = mirror(node.left);
        Node right = mirror(node.right);

        // Swap left and right pointers
        node.left = right;
        node.right = left;

        return node;
    }

    void inOrder() {
        inOrder(root);
    }

    void inOrder(Node node) {
        if (node == null) {
            return;
        }

        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }

    public static void main(String[] args) {
        InvertBinarytree tree = new InvertBinarytree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("InOrder traversal of original tree:");
        tree.inOrder();

        tree.mirror();

        System.out.println("\nInOrder traversal of mirrored tree:");
        tree.inOrder();
    }
}
