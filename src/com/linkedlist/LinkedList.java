package com.linkedlist;

import java.util.spi.CurrencyNameProvider;

public class LinkedList {

	private Node head;
	
	private class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	
	public void insertAtpos(int pos, int data) {
		if(pos< 1) {
			System.out.println("Invalid pos");
			return;
		}
		else if(pos == 1) {
			Node newNode = new Node(data);
			newNode.next = head;
			head = newNode;
		}
		else {
		    int count = 2;
			Node newNode = new Node(data);
			Node temp = head;
			while (temp.next != null) {
				if(pos == count) {
					break;
				}
				temp = temp.next;
				count++;
			}
			Node nextNode = temp.next;
			temp.next = newNode;
			newNode.next = nextNode;
		}
	}
	
	public boolean add(final int data) {
		boolean isAdded = false;
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
			isAdded = true;
		}else {
			Node temp = head;
			
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
			isAdded = true;
		}
		
		return isAdded;
	}
	public void push(int data)
	{
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	} 
	
	public void print() {
		Node temp = head;
		System.out.print("LinkedList : ");
		
		while(temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
	}
	
	public void pop() {
		if(head == null) {
			System.out.println("linked list is already null");
		}
		else {
		  head = head.next;
		}
		
	}
	
	public void popLast() {
		if(head == null) {
			System.out.println("Linkedlist is already null");
		}
		else {
			Node curNode = head;
			Node temp = head;
			while(temp.next != null) {
				curNode = temp;
				temp = temp.next;
			}
			curNode.next = null;
		}
	}
}