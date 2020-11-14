package aufgabe4;

public class SumSearch {
	public void mergeSort(int[] a, int first, int last) {
		if (first < last) {
			int mid = (last + first + 1) / 2;
			mergeSort(a, first, mid - 1);
			mergeSort(a, mid, last);
			merge(a, first, last, mid);
		}
	}

	public void merge(int[] a, int first, int last, int mid) {
		int n = last - first + 1;
		int a1first = first;
		int a1last = mid - 1;
		int a2first = mid;
		int a2last = last;
		int[] anew = new int[n];

		for (int i = 0; i < n; i++) {
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
		for (int i = 0; i < n; i++) {
			a[first + i] = anew[i];
		}
	}

	public boolean findSum(int[] arr, int sum) {
		int[] a = arr.clone();
		mergeSort(a, 0, a.length - 1);

		int first = 0;
		int last = a.length - 1;

		while (first != last) {
			int temp = a[first] + a[last];
			if (temp == sum) {
				return true;
			} else if (temp > sum) {
				last--;
			} else {
				first++;
			}
		}

		return false;
	}

	public void print(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
}
