package aufgabe2;

public class InsertionSort {

	public void inSort(int[] a) {
		int n = a.length;
		for (int i = 0; i < n; i++) {
			int key = a[i];
			int j = i - 1;
			while (j >= 0 && a[j] > key) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = key;
		}
	}

	public void inSortRec(int[] a, int n) {
		if (n <= 1) {
			return;
		} else {
			inSortRec(a, n - 1);

			int key = a[n - 1];
			int j = n - 2;

			while (j >= 0 && a[j] > key) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = key;
		}
	}

	public void print(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
}
