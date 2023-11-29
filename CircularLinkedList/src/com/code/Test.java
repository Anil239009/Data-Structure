package com.code;

public class Test {

	public static void main(String[] args) {
		CircularLinkedList cl=new CircularLinkedList();
		
		System.out.println("Hello ");
		cl.insertData(10);
		cl.displayData();
		cl.insertData(20);
		cl.displayData();
		cl.insertData(30);
		cl.displayData();
		
		cl.insertData(40);
		cl.displayData();
		
		cl.insertData(50);
		cl.displayData();
		
		cl.insertData(60);
		cl.displayData();
		
		cl.insertAtPosition(100, 2);
		cl.displayData();		
//		cl.deletedataByPos(1);
//		cl.displayData();
//		
		
		System.out.println("deleting by value : ");
		cl.deletedataByData(30);
		cl.displayData();
		

	}

}
