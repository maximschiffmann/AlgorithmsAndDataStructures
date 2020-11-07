package Aufgabe2;

public class MatrixMul {

	public int[][] mul(int[][] a, int[][] b) {
		int n = a.length;

		int[][] result = new int[n][n];

		if (n == 1) {
			result[0][0] = a[0][0] * b[0][0];
		} else {
			// a
			int[][] a11 = new int[n / 2][n / 2];
			int[][] a12 = new int[n / 2][n / 2];
			int[][] a21 = new int[n / 2][n / 2];
			int[][] a22 = new int[n / 2][n / 2];

			// b
			int[][] b11 = new int[n / 2][n / 2];
			int[][] b12 = new int[n / 2][n / 2];
			int[][] b21 = new int[n / 2][n / 2];
			int[][] b22 = new int[n / 2][n / 2];

			// Fill arrays a
			fillArrays(a, a11, 0, 0);
			fillArrays(a, a12, 0, n / 2);
			fillArrays(a, a21, n / 2, 0);
			fillArrays(a, a22, n / 2, n / 2);

			// Fill arrays b
			fillArrays(b, b11, 0, 0);
			fillArrays(b, b12, 0, n / 2);
			fillArrays(b, b21, n / 2, 0);
			fillArrays(b, b22, n / 2, n / 2);

			// Recursion
			int[][] h1 = mul(add(a11, a22), add(b11, b12));
			int[][] h2 = mul(add(a21, a22), b11);
			int[][] h3 = mul(a11, sub(b12, b22));
			int[][] h4 = mul(a22, sub(b21, b11));
			int[][] h5 = mul(add(a11, a12), b22);
			int[][] h6 = mul(sub(a21, a11), add(b11, b12));
			int[][] h7 = mul(sub(a12, a22), add(b21, b22));

			int[][] o11 = add(sub(add(h1, h4), h5), h7);
			int[][] o12 = add(h3, h5);
			int[][] o21 = add(h2, h4);
			int[][] o22 = add(sub(add(h1, h3), h2), h6);

			// Fill result
			fillResult(o11, result, 0, 0);
			fillResult(o12, result, 0, n / 2);
			fillResult(o21, result, n / 2, 0);
			fillResult(o22, result, n / 2, n / 2);
		}
		return result;
	}

	public static int[][] add(int[][] a, int[][] b) {
		int n = a.length;

		int[][] result = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				result[i][j] = a[i][j] + b[i][j];
			}
		}
		return result;
	}

	public static int[][] sub(int[][] a, int[][] b) {
		int n = a.length;

		int[][] result = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				result[i][j] = a[i][j] - b[i][j];
			}
		}
		return result;
	}

	public static void fillArrays(int[][] a, int[][] newA, int row, int col) {
		for (int i = 0, i2 = row; i < newA.length; i++, i2++) {
			for (int j = 0, j2 = col; j < newA.length; j++, j2++) {
				newA[i][j] = a[i2][j2];
			}
		}
	}

	public static void fillResult(int[][] a, int[][] newA, int row, int col) {
		for (int i = 0, i2 = row; i < a.length; i++, i2++) {
			for (int j = 0, j2 = col; j < a.length; j++, j2++) {
				newA[i2][j2] = a[i][j];
			}
		}
	}

	public void print(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
