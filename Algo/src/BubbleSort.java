
public class BubbleSort {
	public void bubbleSort(int[] a, int n) {
		for (int i = 0; i < n; i++) {
			for (int j = n - 2; j >= i; j--) {
				if (a[j] > a[j + 1]) {
					int h = a[j];
					a[j] = a[j + 1];
					a[j + 1] = h;
				}
			}
		}
	}
	
	public void bubbleSortBack(int[] a) {
		for (int i = a.length-1; i >= 0; i--) {
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
	}

}
