package BinaryTrees;

public class LowestCommonAnstestorApproach2 {

    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Function to calculate height of the tree
    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;
    }

    // Function to count the number of nodes in the tree
    public static int count(Node root) {
        if (root == null) {
            return 0;
        }
        return count(root.left) + count(root.right) + 1;
    }

    // Naive diameter (O(n^2))
    public static int diameter(Node root) {
        if (root == null) return 0;
        int ld = diameter(root.left);
        int rd = diameter(root.right);
        int lh = height(root.left);
        int rh = height(root.right);
        int selfDiam = lh + rh + 1;
        return Math.max(selfDiam, Math.max(ld, rd));
    }

    // Optimized diameter (O(n))
    static class TreeInfo {
        int height, diameter;

        public TreeInfo(int height, int diameter) {
            this.height = height;
            this.diameter = diameter;
        }
    }

    public static TreeInfo optimizedDiameter(Node root) {
        if (root == null) return new TreeInfo(0, 0);

        TreeInfo left = optimizedDiameter(root.left);
        TreeInfo right = optimizedDiameter(root.right);

        int height = Math.max(left.height, right.height) + 1;
        int selfDiam = left.height + right.height + 1;
        int diameter = Math.max(selfDiam, Math.max(left.diameter, right.diameter));

        return new TreeInfo(height, diameter);
    }

    // Check if two trees are identical
    public static boolean isIdentical(Node node, Node subRoot) {
        if (node == null && subRoot == null) return true;
        if (node == null || subRoot == null || node.data != subRoot.data) return false;

        return isIdentical(node.left, subRoot.left) && isIdentical(node.right, subRoot.right);
    }

    // Check if subRoot is a subtree of root
    public static boolean isSubTree(Node root, Node subRoot) {
        if (root == null) return false;
        if (isIdentical(root, subRoot)) return true;

        return isSubTree(root.left, subRoot) || isSubTree(root.right, subRoot);
    }

    public static void KLevel(Node root, int level, int k) {
        if (root == null) return;
        if (level == k) {
            System.out.print(root.data + " ");
            return;
        }
        KLevel(root.left, level + 1, k);
        KLevel(root.right, level + 1, k);
    }

    // public static boolean getPath(Node root, int n, ArrayList<Node> path) {
    //     if (root == null) return false;

    //     path.add(root);

    //     if (root.data == n) return true;

    //     if (getPath(root.left, n, path) || getPath(root.right, n, path)) {
    //         return true;
    //     }

    //     path.remove(path.size() - 1);
    //     return false;
    // }

    // public static Node lca(Node root, int n1, int n2) {
    //     ArrayList<Node> path1 = new ArrayList<>();
    //     ArrayList<Node> path2 = new ArrayList<>();

    //     if (!getPath(root, n1, path1) || !getPath(root, n2, path2)) {
    //         return null; // Either node not found
    //     }

    //     int i = 0;
    //     while (i < path1.size() && i < path2.size()) {
    //         if (path1.get(i) != path2.get(i)) break;
    //         i++;
    //     }

    //     return path1.get(i - 1); // Last common node
    // }

    public static Node lca2(Node root, int n1,int n2){
        if(root ==null){
            return null;
        }
        if(root.data==n1 || root.data==n2){
            return root;

        }
        Node leftLca=lca2(root.left,n1,n2);
        Node rightLca=lca2(root.right,n1,n2);


        // leftLCA=val rightLCA=null
        if(rightLca ==null){
            return leftLca;
        }
        if(leftLca==null){
            return rightLca;
        }


        return root;

    }

    public static void main(String[] args) {
        /*
         * Tree structure:
         *         1
         *       /   \
         *      2     3
         *     / \   / \
         *    4   5 6   7
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Height: " + height(root));               // Output: 3
        System.out.println("Node Count: " + count(root));            // Output: 7
        System.out.println("Diameter (Naive): " + diameter(root));   // Output: 5
        System.out.println("Diameter (Optimized): " + optimizedDiameter(root).diameter); // Output: 5

        // Subtree:
        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);

        System.out.println("Is SubTree: " + isSubTree(root, subRoot)); // Output: true

        System.out.print("Nodes at level 2: ");
        KLevel(root, 1, 2);  // Output: 4 5 6 7
        System.out.println();


        int n1=4, n2=6;
        System.out.println(lca2(root, n1, n2).data);

        // int n1 = 4, n2 = 5;
        // Node ancestor = lca(root, n1, n2);
        // System.out.println("LCA of " + n1 + " and " + n2 + ": " + (ancestor != null ? ancestor.data : "Not found"));
    }
}

    

