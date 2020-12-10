package aufgabe3;

public class Linear {

	private int m;
	private int[] arr;

	public Linear(int m) {
		this.m = m;
		arr = new int[m];
	}

	public void add(int num) {
		int i = 0;
		boolean found = false;

		while (!found) {
			int position = (num + i) % this.m;
			if (arr[position] == 0) {
				arr[position] = num;
				found = true;
				break;
			} else {
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
