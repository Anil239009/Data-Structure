package Code;

import java.util.Stack;

public class BTS {
	public Node root;

	public BTS() {
		root = null;
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
				if (temp.getLeft() == null) {
					temp.setLeft(newNode);
					return true;
				}
				temp = temp.getLeft();
			} else {
				if (temp.getRight() == null) {
					temp.setRight(newNode);
					return true;
				}
				temp = temp.getRight();
			}
		}
	}

	// sorting using Non recursive function :
	Stack<Node> s = new Stack<Node>();

	public void preOrder() {
		Node temp = root;
		while (temp != null || !s.isEmpty()) {
			while (temp != null) {
				System.out.print(temp.getData() + " ");
				s.push(temp);
				temp = temp.getLeft();
			}
			temp = s.pop();
			temp = temp.getRight();
		}
	}

	// Preorder inorder postorder using recursive function
	public void preOrder(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.getData() + "  ");
		preOrder(root.getLeft());
		preOrder(root.getRight());
	}

	public void inOrder(Node root) {
		if (root == null) {
			return;
		}
		inOrder(root.getLeft());
		System.out.print(root.getData() + "  ");
		inOrder(root.getRight());
	}

	public void postOrder(Node root) {
		if (root == null) {
			return;
		}
		postOrder(root.getLeft());
		postOrder(root.getRight());
		System.out.print(root.getData() + " ");

	}

	// get count of element
	public int getcount(Node root) {
		if (root == null) {
			return 0;
		}
		return 1 + getcount(root.getLeft()) + getcount(root.getRight());
	}
	// deleting element of tree

	public boolean find(Node root, int data) {
		if (root == null) {
			return false;
		}
		if (root.getData() == data) {
			return true;
		}
		if (data < root.getData()) {
			return find(root.getLeft(), data);
		}

		return find(root.getRight(), data);
	}

	public boolean delete(int data) {
		if (root == null) {
			return false;
		}
		//1. locate del and parent
		Node parent = root, del = root;
		while (del.getData() != data) {
			if (data < del.getData()) {
				parent = del;
				del = del.getLeft();
			} else {
				parent = del;
				del = del.getRight();
			}
			//if data is not existing
			if(del==null) {
				return false;
			}
		}
		while(true) {
			//check if node is terminal
			if(del.getLeft()==null && del.getRight()==null) {
				if(del==root) {
					root=null;
					return true;
				}
				if(parent.getLeft()==del) {
					parent.setLeft(null);
				}else {
					parent.setRight(null);
				}
				return true;
			}
			else {
				//shift del down the tree
				if(del.getLeft()!=null) {
					//find max from left
					parent=del;
					Node max=del.getLeft();
					
				while(max.getRight()!= null) {
						parent=max;
						max=max.getRight();
					}
				int temp=max.getData();
				max.setData(del.getData());
				del.setData(temp);
				
				del=max;
				}
				else {
					//min from right
					parent=del;
					Node min=del.getRight();
					while(min.getLeft()!=null) {
						int temp=min.getData();
						min.setData(del.getData());
						del.setData(temp);
						
						del=min;
						
					}
				}
				
			}
		}
		
		
	}

}
