package LinkedList;

import java.util.LinkedList;

public class LinkListBasicSyntax {
    public static class Node{
        int data;
        Node next;

        public Node (int data){
            this.data=data;
            this.next=null;

        }


    }
     Node head;
     Node tail;

    public static void main(String args[]){
        LinkListBasicSyntax ll=new LinkListBasicSyntax();
        ll.head=new Node(1);
        ll.head.next=new Node(2);
    }
    
}
