package BinaryTrees;

// import BinaryTreePreOrder;

public class PreOrdertraversal {
    public static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    public static void preorder(Node root){
        if(root ==null){
            return;
        }
        System.out.println(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        System.out.println("Preorder traversal:");
        preorder(root);
    }
    
}

