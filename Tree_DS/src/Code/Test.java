package Code;

public class Test {

	public static void main(String[] args) {
		BTS bts=new BTS();
		bts.insert(50);
		bts.insert(10);
		bts.insert(80);
		bts.insert(20);
		bts.insert(30);
		bts.insert(60);
		
		System.out.println("preOrder : ");
		bts.preOrder();
		System.out.println();
		System.out.print("PreOrder : ");
		bts.preOrder(bts.root);
		System.out.println();
		System.out.print("InOrder : ");
		bts.inOrder(bts.root);
		System.out.println();
		System.out.print("PostOrder : ");
		bts.postOrder(bts.root);
		
	}

}
