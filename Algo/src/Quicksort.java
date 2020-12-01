
public class Quicksort {
	private int part;

	public Quicksort() {
	}

	public void sort(int[] a, int first, int last) {
		System.out.println("out first: " + first + " last: " + last);
		if (first < last) {
			this.part = this.preparePartition(a, first, last, part);
			sort(a, first, this.part - 1);
			sort(a, this.part + 1, last);
		}
	}

	private int preparePartition(int[] a, int first, int last, int part) {
		System.out.println("first: " + first + " last: " + last);
		int pivot = a[first];
		System.out.println("pivot: " + pivot);
		part = first - 1;
		for (int i = first; i <= last; i++) {
			if (a[i] <= pivot) {
				System.out.println("part: " + part);
				part++;
				int temp = a[i];
				a[i] = a[part];
				a[part] = temp;
				this.print(a);
			}
		}

		System.out.println("part: " + part);
		int temp = a[first];
		a[first] = a[part];
		a[part] = temp;
		this.print(a);
		System.out.println();
		return part;
	}

	private void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
