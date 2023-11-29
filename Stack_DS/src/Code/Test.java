package Code;

public class Test {

	public static void main(String[] args) {
		Stack<Integer> s=new Stack<>(5);
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		
		System.out.println("Removing element from stack");
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
	}
	
	
	
	
}
