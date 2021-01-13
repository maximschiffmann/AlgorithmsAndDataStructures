package Aufgabe3;

public class InsertionSortMinimum {
	public void sort(int[] a) {
		int i;
		int j;
		int key;
		for (j = a.length -1; j >= 0; j--) {
			key = a[j];
			i = j + 1;
			while (i <= a.length - 1 && a[i] < key) {
				a[i - 1] = a[i];
				i++;
			}
			a[i - 1] = key;
			print(a);
		}

	}

	public void print(int[] a) {
		for (int num : a) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

}

/*		public void sort() {
		int i;
		int j;
		int key;

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

	}*/