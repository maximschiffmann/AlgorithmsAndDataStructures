package mapsort;

public class MapSort {
	public void sort(int[] a, int n, double c) {
		int newn = (int) ((double) n * c);
		System.out.println(newn);
		int i;
		int j = 0;
		int[] bin = new int[newn];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (i = 0; i < newn; i++)
			bin[i] = -1;
		for (i = 0; i < n; i++) {
			if (a[i] < min)
				min = a[i];
			if (a[i] > max)
				max = a[i];
		}

		double dist = (double) (max - min) / (double) (newn - 1);

		for (i = 0; i < n; i++) {
			int t = (int) ((double) (a[i] - min) / dist);
			System.out.println(t);
			int insert = a[i];
			int left = 0;
			if (bin[t] != -1 && insert <= bin[t])
				left = 1;

			while (bin[t] != -1) {
				if (left == 1) {
					if (insert > bin[t]) {
						int temp = bin[t];
						bin[t] = insert;
						insert = temp;
					}
					if (t > 0)
						t--;
					else
						left = 0;
				} else {
					if (insert <= bin[t]) {
						int temp = bin[t];
						bin[t] = insert;
						insert = temp;
					}
					if (t < newn - 1)
						t++;
					else
						left = 1;
				}
			}
			bin[t] = insert;
		}
		for (i = 0; i < newn; i++) {
			if (bin[i] != -1)
				a[j++] = bin[i];
		}
	}

	public void print(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
