package aufgabe4;

import java.util.Stack;

public class Func {
	private int n;
	private int m;

	public Func(int n, int m) {
		this.n = n;
		this.m = m;
	}

	public Func() {

	}

	public int rec(int n, int m) {
		// System.out.println("n: " + n + " m: " + m);
		if (n == 0) {
			return m + 1;
		} else if (m == 0 && n >= 1) {
			return rec(n - 1, 1);
		} else {
			return rec(n - 1, rec(n, m - 1));
		}
	}

	public int iter(int n, int m) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.add(n);
		while (!stack.isEmpty()) {
			n = stack.pop();
			if (n == 0) {
				m += 1;
			} else if (m == 0) {
				m += 1;
				stack.add(--n);
			} else {
				stack.add(--n);
				stack.add(++n);
				m--;
			}
		}
		return m;
	}
}
