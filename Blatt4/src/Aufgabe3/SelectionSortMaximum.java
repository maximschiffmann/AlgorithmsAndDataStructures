package Aufgabe3;

public class SelectionSortMaximum {

	public void sort(int[] a) {
		int max;
		for (int i = a.length - 1; i >= 0; i--) {
			max = i;
			for (int j = i; j >= 0; j--) {
				if (a[j] > a[max])
					max = j;
			}
			int temp = a[i];
			a[i] = a[max];
			a[max] = temp;
		}
	}

	public void print(int[] a) {
		for (int num : a) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

}
