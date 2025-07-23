class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class Res {
    public int val;
}

public class MaximumPathSumInABinaryTree {
    Node root;

    int findMaxUtil(Node node, Res res) {
        if (node == null)
            return 0;

        // Recurse for left and right subtrees
        int L = findMaxUtil(node.left, res);
        int R = findMaxUtil(node.right, res);

        // Max path for parent call of root. This path must
        // include at most one child of node
        int max_single = Math.max(Math.max(L, R) + node.data, node.data);

        // Max Top represents the sum when the Node under
        // consideration is the root of the maxsum path and
        // both children are included
        int max_top = Math.max(max_single, L + R + node.data);

        // Update the global result
        res.val = Math.max(res.val, max_top);

        return max_single;
    }

    int findMaxSum() {
        return findMaxSum(root);
    }

    int findMaxSum(Node node) {
        Res res = new Res();
        res.val = Integer.MIN_VALUE;
        findMaxUtil(node, res);
        return res.val;
    }

    public static void main(String[] args) {
        MaximumPathSumInABinaryTree tree = new MaximumPathSumInABinaryTree();
        tree.root = new Node(10);
        tree.root.left = new Node(2);
        tree.root.right = new Node(10);
        tree.root.left.left = new Node(20);
        tree.root.left.right = new Node(1);
        tree.root.right.right = new Node(-25);
        tree.root.right.right.left = new Node(3);
        tree.root.right.right.right = new Node(4);

        System.out.println("Maximum Path sum is: " + tree.findMaxSum());
    }
}
