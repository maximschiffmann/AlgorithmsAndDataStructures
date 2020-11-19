package aufgabe3;

public class Node {
	private Node next = null;
	private Node last = null;
	private int data;
	
	public Node(Node next, Node last, int data) {
		this.next = next;
		this.last = last;
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Node getLast() {
		return last;
	}

	public void setLast(Node last) {
		this.last = last;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
}
