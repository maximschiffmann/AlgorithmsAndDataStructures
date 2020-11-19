package aufgabe2;

public class LinkedListN {
	private Node current = null;
	private Node last = null;
	private Node first = null;
	private int length = 0;

	public void add(int data) {
		if (current == null) {
			current = new Node(null, null, data);
			first = current;
		} else {
			if (current.getNext() == null) {
				current.setNext(new Node(null, current, data));
				last = current.getNext();
				current = last;
			} else {
				Node tempNext = current.getNext();
				current.setNext(new Node(tempNext, current, data));
				tempNext.setLast(current.getNext());
				current = current.getNext();
			}
		}
		length++;
	}

	public void deleteList() {
		if (first != null) {
			first.setNext(null);
			first = null;
		}
		length = 0;
	}

	public void deleteValue(int num) {
		current = first;
		Node prev = null;
		while (current != null) {
			if (current.getData() == num) {
				if (prev == null) {
					first = current.getNext();
				} else {
					prev.setNext(current.getNext());
				}
				if (current == last) {
					last = prev;
				}
				current = current.getNext();
				length--;
			} else {
				prev = current;
				current = current.getNext();
			}
		}
	}

	public void remove() {
		if (current == first) {
			first = current.getNext();
			first.setLast(null);
			current = first;
		} else {
			if (current.getNext() == null) {
				current = current.getLast();
				current.setNext(null);
				last = current;
			} else {
				Node tempNext = current.getNext();
				Node tempLast = current.getLast();
				current = tempLast;
				current.setNext(tempNext);
				tempNext.setLast(current);
			}
		}
	}

	public Node next() {
		if (current.getNext() != null) {
			current = current.getNext();
		} else {
			// System.out.println("last"+ getCurrent().getData());
		}
		return current;
	}

	public Node findByIndex(int index) {
		Node current = first;

		for (int i = 0; i < index; i++) {
			current = current.getNext();
		}

		return current;
	}

	public int length() {
		return length;
	}

	public Node getFirst() {
		return first;
	}

	public Node getCurrent() {
		return current;
	}

	public void setCurrent(Node current) {
		this.current = current;
	}

	public void print() {
		current = first;
		while (current != null) {
			System.out.print(current.getData() + " ");
			current = current.getNext();
		}
		System.out.println();
	}

}
