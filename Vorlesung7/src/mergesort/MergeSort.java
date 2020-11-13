package mergesort;

public class MergeSort {

	public void mergeSort(int[] a, int first, int last) {
		if (first < last) {
			this.print(a);
			int mid = (first + last + 1) / 2;
			mergeSort(a, first, mid - 1);
			mergeSort(a, mid, last);
			merge(a, first, last, mid);
		}
	}

	private void merge(int[] a, int first, int last, int mid) {
		int i;
		int n = last - first + 1;
		int a1first = first;	
		int a1last = mid - 1;	
		int a2first = mid;	
		int a2last = last; 	
		int[] anew = new int[n];

		for (i = 0; i < n; i++) {
			if (a1first <= a1last) {
				if (a2first <= a2last) {
					if (a[a1first] <= a[a2first]) {
						anew[i] = a[a1first++];	
					} else {
						anew[i] = a[a2first++];	
					}
				} else {
					anew[i] = a[a1first++];
				}
			} else {
				anew[i] = a[a2first++];
			}
		}
		for (i = 0; i < n; i++) {
			a[first + i] = anew[i];
		}
	}

	public void print(int[] a) {
		for (int num : a) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
}
