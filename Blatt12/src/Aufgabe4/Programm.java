package Aufgabe4;

public class Programm {

	public static void main(String[] args) {

		int inf = Integer.MAX_VALUE;

		int[][] matrix = { { 0, inf, inf, inf, -1, inf }, { 1, 0, inf, 2, inf, inf }, { inf, 2, 0, inf, inf, -8 },
				{ -4, inf, inf, 0, 3, inf }, { inf, 7, inf, inf, 0, inf }, { inf, 5, 10, inf, inf, 0 } };

		int[][] pred = { { -1, -1, -1, -1, 1, -1 }, { 2, -1, -1, 2, -1, -1 }, { -1, 3, -1, -1, -1, 3 },
				{ 4, -1, -1, -1, -1, -1 }, { -1, 5, -1, -1, -1, -1 }, { -1, 6, 6, -1, -1, -1 } };

		FloydWarshall floyd = new FloydWarshall(matrix, pred);
		floyd.calculate();

	}

}
