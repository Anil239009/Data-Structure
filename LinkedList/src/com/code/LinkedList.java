package com.code;

public class LinkedList {
		//Defining the head and tail node for Singly linked list
		public Node head=null;
		public Node tail=null;
		public Node temp=null;
		
		int count=0;
		//defining a insert function to add new node
		public boolean insert(int data) {
			Node newNode =new Node(data);  //creating a new node
			if(head==null) {    //checking of the list is empty
				//if the given list is empty, making the two nodes head and tail to point to the newly created node newNode
				head=newNode;
				tail=newNode;
				count++;
			}else {
				//otherwise the newNode will be added after tail so that the next pointer of tail points to the newNode 
				tail.setNext(newNode);
				tail=newNode;
				count++;
			}
			
			return true;
		}
		
		public boolean insertposition(int data,int pos) {
			Node newNode=new Node(data);
			if(pos<0 || pos>count+1) {
				System.out.println("Invalid position");
			}
			else if(pos==1) {  //if list is empty
				newNode.setNext(head);
				head=newNode;
				count++;
			}
			
			//if list is not empty
			else {
				temp=head;
				while(--pos>1) {
					temp=(temp.getNext());
			
			}
			 newNode.setNext(temp.getNext());
			 temp.setNext(newNode);
			 count++;
			}
			
			return true;
		}
		//deleting element from beginning
		public void deleteElement() {
			temp =head;
			head=temp.getNext();
			count--;
		}
		
		public void deleteAtSpecificPos(int pos) {
			if(pos<0 || pos>count+1) {
				System.out.println("Invalid position");
			}
			else if(pos==1) {
				temp=head;
				head=temp.getNext();
				count--;
			}
			else {
				temp=head;
			while(--pos>1) {
				System.out.println("pos : "+pos);
				temp=temp.getNext();
				}
				temp.setNext(temp.getNext().getNext());
				count--;
			}
		}
		public void displayList() {
			System.out.println("Count : "+count);
			Node current=head;
			if(head==null) {
				System.out.println("List is empty");
				return;
			}
			while(current!=null) {
				System.out.print(current.getData()+"  ");
				current=current.getNext();
			}
			System.out.println();
			
		}
		
}
