package com.javaclass.datastructures;

import java.util.Optional;

public class LinkedList {

	private Node head = null;
	private Node tail = null;
	private int length;

	class Node {
		int value;
		Node next;

		public Node(int value) {
			this.value = value;
		}
	}

	public void add(int value) {
		Node newNode = new Node(value);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			append(newNode);
		}
		length += 1;

	}

	private void append(Node newNode) {
		tail.next = newNode;
		tail = newNode;
	}

	protected void printList() {
		if (this.head == null)
			System.out.println("Linked List is empty nothing to show. Length: "+this.length);
		else {
			Node temp = head;
			while (temp != null) {
				System.out.print(temp.value + " -> ");
				temp = temp.next;
			}
			System.out.println("Null");
		}
	}

	public Optional<Integer> pop() {
		int item;
		if (this.head == null) {
			System.out.println("Linked List is empty nothing to pop"); 
			return Optional.empty();
		}
//		else if (this.length == 1) {
//			item = head.value;
//			this.head = null;
//			this.tail = null;
//			return Optional.of(item);
//		}
		
		Node temp = head;
		Node current = null;
		while(temp.next != null) {
			current = temp;
			temp = temp.next;
		}
		this.length -= 1;
		item = temp.value;
		this.tail = current;
		
		if(this.tail != null) {
			tail.next = null;	
		}
		else {
			this.head = null;
			this.tail = null;
		}
		
		return Optional.of(item);
		
	}
	
	public int lengthOfLL(){
	    if(head == null) return 0;
	    Node temp = head;
	    int length1 = 0;
	    while(temp.next != null){
	    	System.out.println(temp.value);
	        length1++;
	        temp = temp.next;
	    }
	    return length1+1;
	}
	
	public Node findMiddleNode(){
	    int length1 = lengthOfLL();
	    System.out.println(length1);
	    if(length1 == 0) return null;
	    if(length1 == 1) return head;
	    
	    int index = length1 / 2;
	    if(length1 % 2 == 0) ++index;
	    Node temp = head;
	    for(int i=0; i<index; i++){
	        temp = temp.next;
	    }
	    return temp;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
}
