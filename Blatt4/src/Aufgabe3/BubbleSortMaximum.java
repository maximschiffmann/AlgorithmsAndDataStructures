package Aufgabe3;

public class BubbleSortMaximum {
	public void sort(int[] a) {
		for (int i = a.length-1; i >= 0; i--) {
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
				print(a);
			}
		}
	}

	public void print(int[] a) {
		for (int num : a) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
}
