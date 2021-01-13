package heap;

public class HeapSort {
	public void hespSort(int[] a, int first, int last) {
		buildHeap(a, first, last);
		this.print(a);
		System.out.println("START");
		for (int i = last; i > first; i--) {
			int temp = a[first];
			a[first] = a[i];
			a[i] = temp;
			this.print(a);
			System.out.println("a[i]: " + a[i] + " a[first]: " + a[first]);
			heapify(a, first, i - 1, first);
		}
	}

	public void buildHeap(int[] a, int first, int last) {
		int n = last - first + 1;
		for (int i = first + (n - 2) / 2; i >= first; i--) {
			heapify(a, first, last, i);
		}
	}
	
	public void heapify(int[] a, int first, int last, int root) {
		int largest;
		System.out.println("root " + root);
		int left = first + (root - first) * 2 + 1;
		System.out.println("left " + left);
		int right = first + (root - first) * 2 + 2;
		System.out.println("right " + right);
		if (left <= last && a[left] > a[root])
			largest = left;
		else
			largest = root;
		if (right <= last && a[right] > a[largest])
			largest = right;
		if (largest != root) {
			int temp = a[root];
			a[root] = a[largest];
			a[largest] = temp;
			heapify(a, first, last, largest);
		}
	}
	
	public void print(int[] a) {
		for (int num : a) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
}
