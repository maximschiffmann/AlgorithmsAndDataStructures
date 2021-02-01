package aufgabe3;

public class Doppelt {
	private int m;
	private int[] arr;

	public Doppelt(int m) {
		this.m = m;
		arr = new int[m];
	}

	public void add(int num) {
		int i = 0;
		boolean found = false;

		int position = (num) % this.m;
		int hs = position;
		int hs2 = 1 + (num % (m - 1));

		while (!found) {
			if (arr[position] == 0) {
				arr[position] = num;
				found = true;
				break;
			} else {
				i++;
				position = (hs + i * hs2) % this.m;
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
