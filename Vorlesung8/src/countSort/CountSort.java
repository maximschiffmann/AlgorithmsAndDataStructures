package countSort;

public class CountSort {
	public void sort(int[] a, int n, int k) {
		int i;
		int j = 1;
		int[] bin = new int[k + 1];

		for (i = 0; i < n; i++) 
			bin[a[i]]++;
		
		j = 0;
		for (i = 0; i < n; i++) {
			while (bin[j] == 0)
				j++;
			a[i] = j;
			bin[j]--;
		}
	}

	public void print(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
