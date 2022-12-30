package com.linkedlist;

import java.util.LinkedList;

public class Linkedlist {
	
	 Node head;
	    class Node {
	        String data; 
	        Node next;   

	        Node(String data){
	            this.data = data;
	            this.next = null;
	        }
	    }
	    //Adding the data in first position
	    public void addFirst(String data){
	        Node newNode = new Node(data); 
	        if(head == null){              
	            head = newNode;
	            return;
	        }
	        newNode.next = head;
	        head = newNode;
	    }

	    public static void main(String[] args) {
	        Linkedlist obj = new Linkedlist();

	        obj.addFirst("70");
	        obj.addFirst("30");
	        obj.addFirst("56");


	}
}
