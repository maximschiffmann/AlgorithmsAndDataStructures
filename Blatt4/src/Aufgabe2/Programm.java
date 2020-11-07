package Aufgabe2;

import java.util.Random;

public class Programm {

	public static void main(String[] args) {
		int[][] a = createArr();
		int[][] b = createArr();

		MatrixMul mat = new MatrixMul();
		System.out.println("a: ");
		// mat.print(a);
		System.out.println("b: ");
		// mat.print(b);
		long startTime = System.nanoTime();
		int[][] result = mat.mul(a, b);
		System.out.println("Mul: ");
		long endTime = System.nanoTime();
		long estimatedTime = (endTime - startTime) / 1000000;
		System.out.println("Time: " + estimatedTime + " ms");
		// mat.print(result);
	}

	public static int[][] createArr() {
		Random rand = new Random();
		int num = 100;
		int n = 100;
		int[][] result = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				result[i][j] = rand.nextInt(num) + 1;
			}
		}
		return result;
	}
}
