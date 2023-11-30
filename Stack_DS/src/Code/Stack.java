package Code;

public class Stack<T> {
	private T []arr;
	private int size;
	private int top;
	@SuppressWarnings("unchecked")
	public Stack(int size) {
		super();
		this.size = size;
		top=-1;
		arr=(T[]) new Object[size];
	}
	public boolean isempty() {
		return top==-1;
	}
	public boolean isfull() {
		return top==size-1;
	}
	public boolean push( T data) {
		if(isfull()) {
			return false;
		}
		arr[++top]=data;
		return true;
	}
	public T pop() {
		if(isempty()) {
			return null;
		}
		 return arr[top--];
	}
	public T peek() {
		if(isempty()) {
			return null;
		}
		return arr[top];
	}
	
}

