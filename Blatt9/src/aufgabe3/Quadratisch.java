package aufgabe3;

public class Quadratisch {

	private int m;
	private int c1;
	private int c2;
	private int[] arr;

	public Quadratisch(int m, int c1, int c2) {
		this.m = m;
		this.c1 = c1;
		this.c2 = c2;
		arr = new int[m];
	}

	public void add(int num) {
		int i = 0;
		boolean found = false;

		int position = (num + this.c1 * i + this.c2 * i * i) % this.m;
		int hs = position;

		while (!found) {
			if (arr[position] == 0) {
				arr[position] = num;
				found = true;
				break;
			} else {
				position = (hs + this.c1 * i + this.c2 * i * i) % this.m;
				i++;
			}
		}
	}

	public void print() {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + ": " + arr[i]);
		}
		System.out.println();
	}
}
