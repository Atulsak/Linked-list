package com.linkedlist;

import java.util.LinkedList;

public class Linkedlist {
	
	    Node head;
	    class Node {
	        String data; // initialising data in first location
	        Node next;   // initialising next in node class

	        Node(String data){
	            this.data = data;
	            this.next = null;
	        }
	    }
	    //Adding the data in first position
	    public void addFirst(String data){
	        Node newNode = new Node(data); // Making object of node class
	        if(head == null){              // Checking if linked list is empty
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
