package Code;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadedBinary tb=new ThreadedBinary();
		
		tb.insert(50);
		tb.insert(20);
		tb.insert(10);
		tb.insert(30);
		tb.insert(70);
		tb.insert(60);
		tb.insert(80);
		tb.inOrder(tb.root);
		tb.preOrder(tb.root);

	}

}
