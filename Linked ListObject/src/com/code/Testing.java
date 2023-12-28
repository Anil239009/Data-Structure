package com.code;

import java.util.List;
import java.util.Scanner;

public class Testing {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		LinkedList list = new LinkedList();
		Student s1 = new Student("Anil", "anil@gmail.com", 25);
		Student s2 = new Student("Anuj", "anuj@gmail.com", 23);
		Student s3 = new Student("kalpesh", "kalpesh@gmail.com", 26);
		Student s4 = new Student("rushi", "rushi@gmail.com", 24);
		Student s5 = new Student("Vikram", "vikram@gmail.com", 25);
		list.insert(s1);
		list.insert(s2);
		list.insert(s3);
		list.insert(s4);

		int choice;
		boolean exit=false;
		System.out.println("Menu 1.add new Element 2.Add element at specific position 3.delete element 4.exit");
		while(!exit) {
			System.out.println("Enter your choive");
			choice = sc.nextInt();
			switch (choice) {
			case 1:System.out.println("Enter your name and age ");
			       list.insert(new Student(sc.next(), sc.next(), sc.nextInt()));
			       System.out.println("Student Added sucessfully..!");
				break;
			case 2: System.out.println("Enter your pos, name, mail amd age");
			       list.insertAtSpecificPosition(sc.nextInt(), new Student(sc.next(), sc.next(), sc.nextInt()));
			       System.out.println("Student added successfully..!");
			       break;
			case 3:System.out.println("enter your position");
			       list.deleteElementBySpecificPosition(sc.nextInt());
			       System.out.println("Student deleted sucessfully");
			case 4:
				exit=true;
				break;
			}
		}

		System.out.println("INserting Data successfully...!");
		list.displayElement();

		list.insertAtSpecificPosition(1, s5);

		System.out.println("After adding at specific position");
		list.displayElement();

		list.deleteElementBySpecificPosition(3);

		System.out.println("After deleting the element By position");
		list.displayElement();

		list.reverseList();
		System.out.println("List After revers...");
		list.displayElement();

		List<Student> slist = list.sortListAsPerAge();
		System.out.println(slist);

	}
}
