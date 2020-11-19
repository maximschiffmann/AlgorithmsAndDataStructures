package aufgabe3;

import aufgabe2.Node;

public class RingListe {
	private Node first = null;
	private Node current = null;
	private Node last = null;
	private int length = 0;

	public void add(int data) {
		if (first == null) {
			current = new Node(null, null, data);
			first = current;
			last = current;
			last.setNext(first);
		} else {
			last.setNext(new Node(first, last, data));
			current = last.getNext();
			last = current;
		}
		length++;
	}

	public int pickNumber(int num) {
		current = first;
		int i = 0;
		int result;
		Node prev = null;
		while (i < num) {
			prev = current;
			current = current.getNext();
			i++;
		}
		result = current.getData();
		prev.setNext(current.getNext());
		length--;
		return result;
	}

	public void print() {
		current = first;
		for (int i = 0; i < length; i++) {
			System.out.print(current.getData() + " ");
			current = current.getNext();
		}
		System.out.println();
	}

}
