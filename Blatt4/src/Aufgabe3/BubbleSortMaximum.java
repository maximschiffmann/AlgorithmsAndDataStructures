package Aufgabe3;

public class BubbleSortMaximum {
	public void sort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
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
