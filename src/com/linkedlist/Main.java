package com.linkedlist;

public class Main {
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.add(34);
		linkedList.add(223);
		linkedList.add(64);
		linkedList.add(334);
		linkedList.print();
		System.out.println();
		
		linkedList.insertAtpos(3, 999);
		linkedList.print();
		System.out.println();
		
		linkedList.popLast();
	
		linkedList.print();
		System.out.println();
	}
}
