package Aufgabe4;

public class FloydWarshall {

	int[][] matrix;
	int[][] pred;
	int inf = Integer.MAX_VALUE;

	public FloydWarshall(int[][] arr, int[][] pre) {
		this.matrix = arr;
		this.pred = pre;
	}

	public void calculate() {
		int n = matrix.length;

		for (int k = 0; k < n; k++) {
			int round = k + 1;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (i == k && j == k) {
						continue;
					} else if (matrix[i][k] == inf || matrix[k][j] == inf) {
						continue;
					} else if (matrix[i][j] > matrix[i][k] + matrix[k][j]) {
						matrix[i][j] = matrix[i][k] + matrix[k][j];
						pred[i][j] = round;
					}
				}
			}
			System.out.println("k: " + round);
			printMatrix();
			System.out.println("pre: " + round);
			printPred();
		}
	}

	public void printMatrix() {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == inf) {
					System.out.print("i  ");
				} else {
					System.out.print(matrix[i][j] + "  ");
				}
			}
			System.out.println();
		}
		System.out.println();

	}

	public void printPred() {
		for (int i = 0; i < pred.length; i++) {
			for (int j = 0; j < pred[i].length; j++) {
				if (pred[i][j] == -1) {
					System.out.print("n  ");
				} else {
					System.out.print(pred[i][j] + "  ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}

}
