
public class Countsort {
	public void countSort(int[] a, int n, int k) {
		int i;
		int j = 1;
		int[] bin = new int[k + 1];

		for (i = 1; i <= k; i++)
			bin[i] = 0;
		for (i = 0; i < n; i++)
			bin[a[i]]++;
		for (i = 0; i < n; i++) {
			while (bin[j] == 0)
				j++;
			a[i] = j;
			bin[j]--;
		}
	}

	private int getMaximum(int[] a) {
		int maximum = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			maximum = (a[i] > maximum) ? maximum = a[i] : maximum;
		}
		System.out.println(maximum);
		return maximum;
	}

	private int getMinimum(int[] a) {
		int minimum = Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {
			minimum = (a[i] < minimum) ? minimum = a[i] : minimum;
		}
		System.out.println(minimum);
		return minimum;
	}

	public void sortStandard(int[] a) {
		int maximum = getMaximum(a);
		int minimum = getMinimum(a);
		int length = maximum - minimum + 1;
		System.out.println(length);
		int[] anew = new int[length + 1];

		for (int i = 0; i < a.length; i++) {
			anew[a[i]]++;
		}
		int j = 0;
		for (int i = 0; i < a.length; i++) {
			while (anew[j] == 0)
				j++;
			a[i] = j;
			anew[j]--;
		}
	}

	public void sortNew(int[] a) {
		int maximum = getMaximum(a);
		int minimum = getMinimum(a);
		int length = maximum - minimum + 1;
		int[] anew = new int[length];
		int[] ret = new int[a.length];

		for (int i = 0; i < a.length; i++) {
			anew[a[i] - minimum]++;
		}

		for (int i = 1; i < length; i++) {
			anew[i] = anew[i] + anew[i - 1];
		}

		for (int i = 0; i < a.length; i++) {
			ret[anew[a[i] - minimum] - 1] = a[i];
			anew[a[i] - minimum] = anew[a[i] - minimum] - 1;
		}
		print(ret);
	}

	public void BetterCountSort(int inputArray[]) {
		int n = inputArray.length;
		int k = 0;

		for (int i = 0; i < n; i++) {
			if (inputArray[i] > k)
				k = inputArray[i];
		}

		// ------------------------------------------------------

		int indexArray[] = new int[k + 1];
		int outputArray[] = new int[n];

		for (int i = 0; i < n; i++) {
			indexArray[inputArray[i]]++;

		}

		for (int i = 1; i <= k; i++) {
			indexArray[i] = indexArray[i] + indexArray[i - 1];
		}

		for (int i = 0; i < n; i++) {
			int index_IndexArray = inputArray[i];
			int index_OutputArray = indexArray[index_IndexArray];
			outputArray[index_OutputArray - 1] = index_IndexArray;
			indexArray[index_IndexArray]--;
		}

		// -----------------------------------------------------------------
		for (int i = 0; i < n; i++) {
			inputArray[i] = outputArray[i];
		}

	}

	public void print(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

}
