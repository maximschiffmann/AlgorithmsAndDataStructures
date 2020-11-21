package stapel;

public class Stapel {
	private Object[] o;
	private int size;
	private int tp;

	public Stapel(int size) {
		this.size = size;
		this.tp = -1;
		this.o = new Object[size];
	}

	public void push(Object o) {
		if (!isFull()) {
			this.o[++tp] = o;
		}
	}

	public Object pop() {
		if (!isEmpty()) {
			return this.o[tp--] = null;
		} else {
			System.out.println("Stack is empty!");
		}
		return null;
	}

	public boolean isEmpty() {
		return (tp > -1) ? false : true;
	}

	public boolean isFull() {
		return (tp >= size) ? true : false;
	}

	public void print() {
		for (int i = this.size -1 ; i >= 0; i--) {
			System.out.println(o[i]);
		}
	}

}
