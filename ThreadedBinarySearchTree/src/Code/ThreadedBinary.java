package Code;

public class ThreadedBinary {
	public Node root;

	public ThreadedBinary() {
		this.root = null;
	}

	public boolean insert(int data) {
		Node newNode = new Node(data);
		if (newNode == null) {
			return false;
		}

		if (root == null) {
			root = newNode;
			return true;
		}
		Node temp = root;
		while (true) {

			if (data == temp.getData()) {
				return false;
			}
			if (data < temp.getData()) {
				if (temp.getlFlag() == 'T') {
					newNode.setRight(temp);
					newNode.setLeft(temp.getLeft());
					temp.setLeft(newNode);
					temp.setlFlag('L');
					return true;
				}
				temp = temp.getLeft();
			} else {

				if (temp.getrFlag() == 'T') {
					newNode.setLeft(temp);
					newNode.setRight(temp.getRight());
					temp.setRight(newNode);
					temp.setrFlag('L');
					return true;
				}
				temp = temp.getRight();

			}
		}
	}

	public void inOrder(Node root) {
		Node temp = root;
		char flag = 'L';
		System.out.print("In-Order : ");
		while (temp != null) {
			while (temp.getlFlag() == 'L' && flag == 'L') {
				temp = temp.getLeft();
			}
			System.out.print(temp.getData() + " ");
			flag = temp.getrFlag();
			temp = temp.getRight();
		}
		System.out.println();
	}
	public void preOrder(Node root) {
		Node temp=root;
		char flag='L';
		System.out.println("Post-Order : ");
		while(temp!=null) {
			while(temp.getlFlag()=='L' && flag=='L') {
				System.out.print(temp.getData()+" ");
				temp=temp.getLeft();
			}
			if(flag=='L') {
				System.out.print(temp.getData()+ " ");
			}
			flag=temp.getrFlag();
			temp=temp.getRight();
		}
		System.out.println();
	}
	
	public void postOrder(Node node) {
		Node temp=root;
		char flag='L';
		while(temp!=null) {
			while(temp.getlFlag()=='L'&&flag=='L') {
				temp=temp.getLeft();
			}
			flag=temp.getrFlag();
			if(flag=='L') {
				temp=temp.getRight();
			}
			else {
				while(true) {
					System.out.print(temp.getData()+ " ");
					if(isRightChild(temp)) {
						while(temp.getlFlag()=='L'&&flag=='L') {
							temp=temp.getLeft();
						}
						}
					else {
						while(temp.getrFlag()=='L') {
							temp=temp.getRight();
						}
						temp=temp.getRight();
					}
				}
			}
		}
		System.out.println();
	}
	
	public boolean isRightChild(Node node) {
		
		
		return true;
	}

}
