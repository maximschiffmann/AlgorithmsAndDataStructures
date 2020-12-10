
public class InsertionSort {
	public void insertionSort(int[] a, int n) {
		int i, j, key;

		for (j = 1; j < n; j++) {
			key = a[j];
			i = j - 1;
			while (i >= 0 && a[i] > key) {
				a[i + 1] = a[i];
				i = i - 1;
			}
			a[i + 1] = key;
		}
	}

	public void insertionSortBack(int[] a) {
		int i;
		int j;
		int key;
		for (j = a.length - 1; j >= 0; j--) {
			key = a[j];
			i = j + 1;
			while (i <= a.length - 1 && a[i] < key) {
				a[i - 1] = a[i];
				i++;
			}
			a[i - 1] = key;
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

}
