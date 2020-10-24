package MaxTeilsum;

public class MaxTeilsumAlgos {
	private int[] array;
	private int length;

	public MaxTeilsumAlgos(int[] arr) {
		this.array = arr;
		this.length = arr.length;
	}

	public int MaxTeilsum1() {
		int i;
		int j;
		int k;
		int sum;
		int max = Integer.MIN_VALUE;

		for (i = 0; i < this.length; i++) {
			for (j = i; j < this.length; j++) {
				sum = 0;
				for (k = i; k <= j; k++) {
					sum += this.array[k];
					if (sum > max)
						max = sum;
				}
			}
		}
		return max;
	}

	public int MaxTeilsum2() {
		int i;
		int j;
		int sum;
		int max = Integer.MIN_VALUE;

		for (i = 0; i < this.length; i++) {
			sum = 0;
			for (j = i; j < this.length; j++) {
				sum += this.array[j];
				if (sum > max)
					max = sum;
			}
		}
		return max;
	}

	public int MaxTeilsum3() {
		int i;
		int sum;
		int aktSum = 0;
		int max = Integer.MIN_VALUE;

		for (i = 0; i < this.length; i++) {
			sum = aktSum + this.array[i];
			if (sum > this.array[i])
				aktSum = sum;
			else
				aktSum = this.array[i];
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
					Math.max(MaxTeilsum4(a, first + newn, last), 
							MaxBorderSum1 + MaxBorderSum2));
		}
	}

}
