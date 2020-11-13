package aufgabe2;

public class MergeSort {

	public void sort(int[] a, int first, int last) {
		if (first < last) {
			int mid = (last + first + 1) / 2;
			sort(a, first, mid - 1);
			sort(a, mid, last);
			merge(a, first, last, mid);
		}
	}

	public void merge(int[] a, int first, int last, int mid) {
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

	public void sortItr(int[] a) {
		int n = a.length;
		int[] b = new int[n / 2];

		int s;
		int m;
		for (s = 1; s < n; s += s) {
			System.out.println("s: " + s);
			for (m = n - 1 - s; m >= 0; m -= s + s) {
				System.out.println("m: " + m);
				mergeItr(a, b, max(m - s + 1, 0), m, m + s);
			}
		}
	}

	void mergeItr(int[] a, int[] b, int lo, int m, int hi) {
		System.out.println("lo: " + lo + " m: " + m + " hi: " + hi);
		int i;
		int j;
		int k = 0;

		i = 0;
		j = lo;

		while (j <= m) {
			b[i++] = a[j++];
		}

		i = 0;
		k = lo;

		while (k < j && j <= hi) {
			if (b[i] <= a[j])
				a[k++] = b[i++];
			else
				a[k++] = a[j++];
		}

		while (k < j) {
			a[k++] = b[i++];
		}
	}

	private int max(int a, int b) {
		return a > b ? a : b;
	}
}
