package com.code;

public class TestList {

	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.insert(10);
		list.insert(20);
		list.insert(30);
		list.insert(40);
		list.displayList();
		System.out.println("Adding element at specific position");
		list.insertposition(70, 3);
		list.displayList();
		
		list.insertposition(80, 6);
		list.displayList();
		
	
		list.insertposition(70, -1);
		list.displayList();
		System.out.println("Deleting element from 1st position");
		list.deleteElement();
		list.displayList();
		
		list.deleteElement();
		list.displayList();
		
		System.out.println("Deleting element at specific position");
		list.deleteAtSpecificPos(-1);
		list.displayList();
		
		list.deleteAtSpecificPos(3);
		list.displayList();
	}
}
