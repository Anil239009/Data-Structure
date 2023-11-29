package com.code;

public class CircularLinkedList {
	Node head;

	public CircularLinkedList() {
		head = null;
	}

	public boolean insertData(int data) {
		Node newNode = new Node(data);
//if new node reference is null		
		if (newNode == null) {
			return false;
		}
//if list is empty		
		if (head == null) {
			head = newNode;
			newNode.setNext(head);
			return true;
		}
// Insert element at last position

		Node temp = head;
		while (temp.getNext() != head) {
			temp = temp.getNext();
		}
		temp.setNext(newNode);
		newNode.setNext(head);

		return true;
	}
//insert element at specific position
	
	public boolean insertAtPosition(int data, int pos) {
		Node newNode = new Node(data);
		
//if position is less than 0
		if (pos <= 0) {
			return false;
		}
//if list is empty
		if (newNode == null) {
			return false;
		}
//when element at 1st position
		if (pos == 1) {
			//when list is empty
			if (head == null) {
				head = newNode;
				newNode.setNext(head);
				return true;
			}
			//when list is not empty
			if (head != null) {
				newNode.setNext(head);
				head = newNode;
				return true;
			}
		}
//insert element at last Position
		Node temp = head;
		while (--pos > 1) {
			temp = temp.getNext();
		}
		newNode.setNext(temp.getNext());
		temp.setNext(newNode);
		return true;
	}

//deleting data by value	
	public boolean deletedataByData(int data) {
		if (head == null) {
			return false;
		}
		if (head.getData() == data) {
			if (head.getNext() == head) {
				head = null;
				return true;
			}
// delete at last position
			Node temp = head;
			while (temp.getNext() != head) {
				temp = temp.getNext();
			}
			temp.setNext(head.getNext());
			head = temp.getNext();
			return true;
		}
		Node temp = head, del = head;
		while (del.getData() != data) {
			temp = del;
			del = del.getNext();
			if (del == head) {
				return false;
			}
		}
		temp.setNext(del.getNext());
		return true;
	}

	public boolean deletedataByPos(int pos) {
		if (pos <= 0) {
			return false;
		}
		if (pos == 1) {
			if (head == head.getNext()) {
				head = null;
				return true;
			}
			Node temp = head;
			while (temp.getNext() != head) {
				temp = temp.getNext();
			}
			temp.setNext(head.getNext());
			head = head.getNext();
		}
		return true;
	}

	public void displayData() {
		Node temp = head;

		if (head == null) {
			return;
		}
		do {
			System.out.print(temp.getData() + "  ");
			temp = temp.getNext();
		} while (temp != head);
		System.out.println();
	}

}
