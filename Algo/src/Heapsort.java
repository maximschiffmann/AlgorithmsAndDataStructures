
public class Heapsort {
	public void heapSort(int[] a, int first, int last) {
		buildHeap(a, first, last);
		for (int i = last; i > first; i--) {
			int temp = a[first];
			a[first] = a[i];
			a[i] = temp;
			heapify(a, first, i - 1, first);
		}
	}

	public void buildHeap(int[] a, int first, int last) {
		int n = last - first + 1;

		for (int i = first + (n - 2) / 2; i >= first; i--) {
			heapify(a, first, last, i);
		}
	}

	void heapify(int[] a, int first, int last, int root) {
		int largest;
		int left = first + (root - first) * 2 + 1;
		int right = first + (root - first) * 2 + 2;

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

}
