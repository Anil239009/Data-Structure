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

}
