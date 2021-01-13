package sorting;

public class InsertionSort {

	private int[] arr;

	public InsertionSort(int[] arr) {
		this.arr = arr;
	}

	public void sort() {
		int i;
		int j;
		int key;
		this.print();
		for (j = 1; j < this.arr.length; j++) {
			key = this.arr[j];
			i = j - 1;
			while (i >= 0 && this.arr[i] > key) {
				this.arr[i + 1] = this.arr[i];
				i--;
			}
			this.arr[i + 1] = key;
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
