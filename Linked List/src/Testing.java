
public class Testing {

	public static void main(String[] args) {
		LinkedList list= new LinkedList();
		
		list.insert(10);
		list.insert(20);
		list.insert(30);
		list.insert(40);
		list.insert(50);
		System.out.println("INserting Data successfully...!");
		list.displayElement();
		
		list.insertAtSpecificPosition(1, 5);
		list.insertAtSpecificPosition(7, 60);
		System.out.println("After adding at specific position");
		list.displayElement();
		
		list.deleteElementByValue(5);
		list.deleteElementByValue(40);
		System.out.println("After deleting the element");
		list.displayElement();
		
		
		list.deleteElementBySpecificPosition(3);
		list.deleteElementBySpecificPosition(3);
		System.out.println("After deleting the element By position");
		list.displayElement();
		
		
		list.reverseList();
		System.out.println("List After revers...");
		list.displayElement();
		
	}
}
