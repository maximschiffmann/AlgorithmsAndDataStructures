
public class SelectionSort {
	public void selectionSort(int[] a, int n) {
		int i, j, min;
		for (i = 0; i < n; i++) {
			min = i;
			for (j = i; j < n; j++) {
				if (a[j] < a[min])
					min = j;
			}
			int h = a[i];
			a[i] = a[min];
			a[min] = h;
		}
	}

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
}
