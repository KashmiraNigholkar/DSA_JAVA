package BinarySearchTree;

class Node {
    int data;
    Node left, right;
    Node(int x) {
        data = x;
        left = right = null;
    }
}

public class FindTheKthSmallestelementInBST {
    static int count = 0;

    // Function to insert a node into BST
    public static Node insert(Node root, int x) {
        if (root == null) {
            return new Node(x);
        }
        if (x < root.data)
            root.left = insert(root.left, x);
        else if (x > root.data)
            root.right = insert(root.right, x);

        return root;
    }

    // Utility function to find kth smallest
    public static Node kthSmallest(Node root, int k) {
        if (root == null)
            return null;

        // Search in left subtree
        Node left = kthSmallest(root.left, k);
        if (left != null)
            return left;

        // Increment count and check
        count++;
        if (count == k)
            return root;

        // Search in right subtree
        return kthSmallest(root.right, k);
    }

    // Function to print kth smallest
    public static void printKthSmallest(Node root, int k) {
        count = 0; // Reset count for each query
        Node res = kthSmallest(root, k);
        if (res == null)
            System.out.println("There are less than " + k + " nodes in BST");
        else
            System.out.println("K-th Smallest element is " + res.data);
    }

    // Driver code
    public static void main(String[] args) {
        Node root = null;
        int keys[] = {20, 8, 22, 4, 12, 10, 14};

        for (int val : keys) {
            root = insert(root, val);
        }

        int k = 3;
        printKthSmallest(root, k);  // Should print 10
    }
}
