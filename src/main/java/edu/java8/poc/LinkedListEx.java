package edu.java8.poc;

import org.w3c.dom.Node;

public class LinkedListEx {

    Node head;

    class Node{

        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        LinkedListEx list = new LinkedListEx();
        Node node = null;

        list.insert( 3);
        list.insert( 2);

        list.insert( 7);

    }

    public  void insert(int data){

            Node node = new Node(data);
            node.next = head;
            head = node;

    }

}

