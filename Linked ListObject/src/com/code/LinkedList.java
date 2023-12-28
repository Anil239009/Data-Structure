package com.code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LinkedList {
	private Node head;
	
	public LinkedList() {
		head=null;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}
	
//	Insert element into linked list
	
	public boolean insert(Student student) {
		Node newNode=new Node(student);
		
		if(newNode==null) {
			return false;
		}
		//if list is empty
		if(head==null) {
			head=newNode;
			return true;
		}
		
		//insert node at last position
		Node last=head;
		while(last.getNext()!=null) {
			last=last.getNext();
		}
		last.setNext(newNode);
		return true;
	}

//	insert element at specific position
	public boolean insertAtSpecificPosition(int pos,Student student) {
		
		if(pos<=0) {
			System.out.println("Invalid position...!");
			return false;
		}
		Node newNode=new Node(student);
		if(newNode==null) {
			return false;
		}
		
		if(pos==1) {
			newNode.setNext(head);
			head=newNode;
			return true;
		}
		
		Node temp=head;
		for(int i=1;i<pos-1;i++) {
			temp=temp.getNext();
			if(temp==null) {
				return false;
			}
		}
		newNode.setNext(temp.getNext());
		temp.setNext(newNode);		
		return true;
	}
//	delete element by value
//	public boolean deleteElementByValue(int data) {
//		//when list is empty
//		if(head==null) {
//			return false;
//		}
//		//when data is present at 1st position
//		if(head.getData()==data) {
//			head=head.getNext();
//			return true;
//		}
//		//when data is at specific position
//		Node prev=head;
//		Node next=head;
//		while(next.getData()!=data) {
//			prev=next;
//			next=next.getNext();
//		}
//		prev.setNext(next.getNext());
//		return true;
//	}
//	delete element By specific position
	public boolean deleteElementBySpecificPosition(int pos) {
		if(head==null || pos<=0) {
			return false;
		}
		
		if(pos==1) {
			head=head.getNext();
			return true;
		}
		
		Node prev=head;
		for(int i=1;i<pos-1;i++) {
			prev=prev.getNext();
		}
		Node del=prev.getNext();
		prev.setNext(del.getNext());
		
		return true;
	}
//	Reverse the Linked List
	public void reverseList() {
		if(head==null || head.getNext()==null) {
			return;
		}
		Node N1=head;
		Node N2=head.getNext();
		Node N3;
		while(N2!=null) {
			N3=N2.getNext();
			N2.setNext(N1);
			N1=N2;
			N2=N3;
		}
		head.setNext(null);
		head=N1;
	}
	public void displayElement() {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.getStudent()+"  ");
			temp=temp.getNext();
		}
		System.out.println();
	}
	
	public List<Student> sortListAsPerAge() {
		List<Student> studentlist=new ArrayList<Student>();
		Node temp=head;
		while(temp!=null) {
			studentlist.add(temp.getStudent());
			temp=temp.getNext();
		}
		
		Collections.sort(studentlist, (s1,s2)->Integer.compare(s1.getAge(), s2.getAge()));
		return studentlist;
	}
	
	
	
	
}
