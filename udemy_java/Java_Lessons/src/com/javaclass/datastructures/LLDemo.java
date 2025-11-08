package com.javaclass.datastructures;

public class LLDemo {
	
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(4);
		ll.add(3);
		ll.add(12);
		ll.add(2);
		ll.add(24);
		ll.printList();
//		for(int i = 0; i < 6; i++)
//			System.out.println(ll.pop().orElse(-1));
//		ll.printList();
		System.out.println(ll.getLength()+ " " +ll.findMiddleNode().value);
	}
}
