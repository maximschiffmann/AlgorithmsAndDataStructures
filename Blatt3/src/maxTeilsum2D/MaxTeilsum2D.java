package maxTeilsum2D;

public class MaxTeilsum2D {
	private int[][] arr;
	private int rows;
	private int cols;

	public MaxTeilsum2D(int[][] arr) {
		this.arr = arr;
		this.rows = this.arr.length;
		this.cols = this.arr[0].length;
	}

	public int sum() {
		int n = this.rows;
		int m = this.cols;
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < m; i++) {
			int temp[] = new int[n];
			for (int j = i; j < m; j++) {
				for (int k = 0; k < n; k++) {
					temp[k] += this.arr[k][j];
				}
				int aktSum = this.MaxTeilsum3(temp);
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
