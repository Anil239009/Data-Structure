package Code;

public class Test {

	public static void main(String[] args) {
		BTS bst=new BTS();
		bst.insert(50);
		bst.insert(10);
		bst.insert(80);
		bst.insert(20);
		bst.insert(30);
		bst.insert(60);
		
		System.out.println("preOrder : ");
		bst.preOrder();
		System.out.println();
		System.out.print("PreOrder : ");
		bst.preOrder(bst.root);
		System.out.println();
		System.out.print("InOrder : ");
		bst.inOrder(bst.root);
		System.out.println();
		System.out.print("PostOrder : ");
		bst.postOrder(bst.root);
		System.out.println();

		
		int count=bst.getcount(bst.root);
		System.out.println("Count of element is : "+count);
		
		System.out.println("60? " + bst.find(bst.root, 60));
        System.out.println("70? " + bst.find(bst.root,70));
        System.out.println("50? " + bst.find(bst.root, 50));
        System.out.println("160? " + bst.find(bst.root, 160));

        bst.delete(50);
        bst.preOrder();
        

        System.out.println("Del 49: " + bst.delete(49));

		
	}

}
