package queuel;

import java.util.LinkedList;

public class Queuel {
	private LinkedList<Object> o;
	private int size;
	private int first;
	private int last;
	private boolean empty;
	private boolean full;

	public Queuel(int n) {
		this.size = n;
		this.first = 0;
		this.last = 0;
		this.empty = true;
		this.full = false;
		this.o = new LinkedList<Object>();
	}

	public void enqueue(Object o) {
		if (!isFull()) {
			this.empty = false;
			this.o.add(o);
			last = (last + 1) % size;
			if (first == last) {
				this.full = true;
			}
		} else {
			System.out.println("Queue is full!");
		}
	}

	public Object dequeue() {
		if (!isEmpty()) {
			this.full = false;
			Object ret = o.remove();
			first = (first + 1) % size;
			if (first == last) {
				empty = true;
			}
			return ret;
		}
		return null;
	}

	public boolean isFull() {
		return full;
	}

	public boolean isEmpty() {
		return empty;
	}

	public void print() {
		for (int i = 0; i < this.o.size(); i++) {
			System.out.print(o.get(i) + " ");
		}
		System.out.println();
	}
}
