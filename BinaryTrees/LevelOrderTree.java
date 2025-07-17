package BinaryTrees;
import java.util.*;

public class LevelOrderTree  {
    public static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // Preorder traversal: Root -> Left -> Right
    public static void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // Postorder traversal: Left -> Right -> Root
    public static void postorder(Node root) {
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }
    // level order traversal
    public static void levelOrder(Node root){
        if(root ==null){
            return;

        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currNode=q.remove();
            if(currNode ==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.println(currNode.data+" ");
                if(currNode.left !=null){
                    q.add(currNode.left);

                }
                if(currNode.right !=null){
                    q.add(currNode.right);

                }
            }
        }
    }


    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("Preorder traversal:");
        preorder(root); 
        System.out.println();

        System.out.println("Postorder traversal:");
        postorder(root); 

        System.out.print("Levelorder traversal:");
        levelOrder(root); 
    }
}

    

