package BinarySearchTree;
import java.util.ArrayList;

public class Merge2BSts {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    // Inorder traversal to get sorted array
    public static void getInorder(Node root, ArrayList<Integer> arr) {
        if (root == null) return;
        getInorder(root.left, arr);
        arr.add(root.data);
        getInorder(root.right, arr);
    }

    // Convert sorted array to balanced BST
    public static Node createBST(ArrayList<Integer> arr, int st, int end) {
        if (st > end) return null;
        int mid = (st + end) / 2;
        Node root = new Node(arr.get(mid));
        root.left = createBST(arr, st, mid - 1);
        root.right = createBST(arr, mid + 1, end);
        return root;
    }

    // Merge two sorted arrays
    public static Node mergeBSTS(Node root1, Node root2) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        
        getInorder(root1, arr1);
        getInorder(root2, arr2);

        // Merge arrays
        ArrayList<Integer> finalArr = new ArrayList<>();
        int i = 0, j = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) <= arr2.get(j)) {
                finalArr.add(arr1.get(i++));
            } else {
                finalArr.add(arr2.get(j++));
            }
        }
        while (i < arr1.size()) {
            finalArr.add(arr1.get(i++));
        }
        while (j < arr2.size()) { // Fixed condition here
            finalArr.add(arr2.get(j++));
        }

        // Convert merged array to BST
        return createBST(finalArr, 0, finalArr.size() - 1);
    }

    // Print inorder
    public static void printInorder(Node root) {
        if (root == null) return;
        printInorder(root.left);
        System.out.print(root.data + " ");
        printInorder(root.right);
    }

    public static void main(String[] args) {
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        Node mergedRoot = mergeBSTS(root1, root2);

        System.out.print("Inorder of merged BST: ");
        printInorder(mergedRoot);
    }
}
