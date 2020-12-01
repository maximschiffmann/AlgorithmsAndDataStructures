
public class MaxTeilsum {

	public int maxTeilsum1(int[] a, int n) {
		int i, j, k, sum, max = Integer.MIN_VALUE;

		for (i = 0; i < n; i++) {
			for (j = i; j < n; j++) {
				sum = 0;
				for (k = i; k <= j; k++)
					sum += a[i];
				if (sum > max)
					max = sum;
			}
		}
		return max;
	}

	public int maxTeilsum2(int[] a, int n) {
		int i, j, sum, max = Integer.MIN_VALUE;

		for (i = 0; i < n; i++) {
			sum = 0;
			for (j = i; j < n; j++) {
				sum += a[j];
				if (sum > max)
					max = sum;
			}
		}
		return max;
	}

	public int maxTeilsum3(int[] a, int n) {
		int i, s, max = Integer.MIN_VALUE, aktSum = 0;

		for (i = 0; i < n; i++) {
			s = aktSum + a[i];
			if (s > a[i])
				aktSum = s;
			else
				aktSum = a[i];
			if (aktSum > max)
				max = aktSum;
		}
		return max;
	}

	public int MaxTeilsum4(int[] a, int first, int last) {
		int n = last - first + 1;
		if (n == 1)
			return a[first];
		else {
			int newn = (n % 2 == 0 ? n / 2 : n / 2 + 1);
			int MaxBorderSum1 = a[first + newn - 1];
			int i = first + newn - 2;
			int currVal = MaxBorderSum1;
			while (i >= first) {
				currVal += a[i];
				if (currVal > MaxBorderSum1)
					MaxBorderSum1 = currVal;
				i--;
			}
			int MaxBorderSum2 = a[first + newn];
			i = first + newn + 1;
			currVal = MaxBorderSum2;
			while (i <= last) {
				currVal += a[i];
				if (currVal > MaxBorderSum2)
					MaxBorderSum2 = currVal;
				i++;
			}
			return Math.max(MaxTeilsum4(a, first, first + newn - 1),
					Math.max(MaxTeilsum4(a, first + newn, last), MaxBorderSum1 + MaxBorderSum2));
		}
	}

	public int sum(int[][] a) {
		int n = a.length;
		int m = a[0].length;
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < m; i++) {
			int temp[] = new int[n];
			for (int j = i; j < m; j++) {
				for (int k = 0; k < n; k++) {
					temp[k] += a[k][j];
				}
				int aktSum = MaxTeilsum3(temp);
				if (aktSum > max)
					max = aktSum;
			}
		}
		return max;
	}

	public int MaxTeilsum3(int[] arr) {
		int i;
		int sum;
		int aktSum = 0;
		int max = Integer.MIN_VALUE;

		for (i = 0; i < arr.length; i++) {
			sum = aktSum + arr[i];
			if (sum > arr[i])
				aktSum = sum;
			else
				aktSum = arr[i];
			if (aktSum > max)
				max = aktSum;
		}
		return max;
	}

}
