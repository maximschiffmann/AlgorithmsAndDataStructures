package sorting;

public class SelectionSort {
	private int[] arr;

	public SelectionSort(int[] arr) {
		this.arr = arr;
	}

	public void sort() {
		int min;
		for (int i = 0; i < this.arr.length; i++) {
			min = i;
			for (int j = i; j < this.arr.length; j++) {
				if (this.arr[j] < this.arr[min])
					min = j;
			}
			int temp = this.arr[i];
			this.arr[i] = this.arr[min];
			this.arr[min] = temp;
			this.print();
		}
	}

	private void print() {
		for (int i = 0; i < this.arr.length; i++) {
			System.out.print(this.arr[i] + " ");
		}
		System.out.println();
	}
}
