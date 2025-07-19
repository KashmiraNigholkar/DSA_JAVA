package BinaryTrees;

public class KthLevel {
    

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
        int leftCount = count(root.left);
        int rightCount = count(root.right);
        return leftCount + rightCount + 1;
    }

    // Naive O(N^2) diameter
    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }
        int leftDiam = diameter(root.left);
        int rightDiam = diameter(root.right);
        int leftHt = height(root.left);
        int rightHt = height(root.right);

        int selfDiam = leftHt + rightHt + 1;
        return Math.max(selfDiam, Math.max(leftDiam, rightDiam));
    }

    // Optimized O(N) diameter using helper class
    static class TreeInfo {
        int height;
        int diameter;

        public TreeInfo(int height, int diameter) {
            this.height = height;
            this.diameter = diameter;
        }
    }

    public static TreeInfo optimizedDiameter(Node root) {
        if (root == null) {
            return new TreeInfo(0, 0);
        }

        TreeInfo left = optimizedDiameter(root.left);
        TreeInfo right = optimizedDiameter(root.right);

        int height = Math.max(left.height, right.height) + 1;
        int selfDiam = left.height + right.height + 1;
        int diameter = Math.max(selfDiam, Math.max(left.diameter, right.diameter));

        return new TreeInfo(height, diameter);
    }

    // Function to check if two trees are identical
    public static boolean isIdentical(Node node, Node subRoot) {
        if (node == null && subRoot == null) {
            return true;
        }
        if (node == null || subRoot == null || node.data != subRoot.data) {
            return false;
        }
        return isIdentical(node.left, subRoot.left) && isIdentical(node.right, subRoot.right);
    }

    // Function to check if subRoot is a subtree of root
    public static boolean isSubTree(Node root, Node subRoot) {
        if (root == null) {
            return false;
        }
        if (isIdentical(root, subRoot)) {
            return true;
        }

        return isSubTree(root.left, subRoot) || isSubTree(root.right, subRoot);
    }

    static class Info{
        Node node;
        int hd;

        public Info(Node node, int  hd){
            this.node=node;
            this.hd=hd;
        }
    }
    // public static void topView(Node root){
    //     Queue<Info> q=new LinkedList<>();
    //     HashMap<Integer,Node> map=new HashMap<>();
    //     int min=0,max=0;q.add(new Info(root,0));
    //     q.add(null);
    //     while(!q.isEmpty()){
    //         Info curr=q.remove();
    //         if(curr ==null){
    //             if(q.isEmpty()){
    //                 break;
    //             }else{
    //                 q.add(null);
    //             }
    //         }else{
    //         if(!map.containsKey(curr.hd)){
    //             map.put(curr.hd, curr.node);

    //         }
    //         if(curr.node.left !=null){
    //             q.add(new Info(curr.node.left,curr.hd-1));
    //             min=Math.min(min,curr.hd-1);
    //         }
    //         if(curr.node.right !=null){
    //             q.add(new Info(curr.node.right,curr.hd+1));
    //             max=Math.max(max,curr.hd+1);
    //         }
    //     }
    // }
    //     for(int i=min;i<=max;i++){
    //         System.out.println(map.get(i).data+"");
    //     }
    //     System.out.println();
    // }
    public static void KLevel(Node root,int level,int k){
        if(root ==null){
            return;
        }
        if(level ==k){
            System.out.println(root.data+"");
            return;
        }
        KLevel(root.left, level+1, k);
        KLevel(root.right, level+1, k);
    }

    // Main method with test example
    public static void main(String[] args) {
        /*
         * Tree root:
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

        /*
         * Subtree:
         *      2
         *     / \
         *    4   5
         */
        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);

        System.out.println("Is SubTree: " + isSubTree(root, subRoot)); // Output: true

        // topView(subRoot);
        int k=2;
        KLevel(root, 1, k);
    }
}

    


    
