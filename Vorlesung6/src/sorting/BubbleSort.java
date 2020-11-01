package sorting;

public class BubbleSort {
	private int[] arr;

	public BubbleSort(int[] arr) {
		this.arr = arr;
	}

	public void sort() {
		int steps = 0;
		for (int i = 0; i < this.arr.length; i++) {
			for (int j = this.arr.length - 2; j >= i; j--) {
				if (this.arr[j] > this.arr[j + 1]) {
					int temp = this.arr[j];
					this.arr[j] = this.arr[j + 1];
					this.arr[j + 1] = temp;
					this.print();
					steps++;
				}
			}
		}
		System.out.println("Steps: " + steps);
	}

	private void print() {
		for (int i = 0; i < this.arr.length; i++) {
			System.out.print(this.arr[i] + " ");
		}
		System.out.println();
	}
}
