package Aufgabe4;

public class Programm {

	public static void main(String[] args) {

		int inf = Integer.MAX_VALUE;

		int[][] matrix = { 
				{ 0, inf, inf, inf, -1, inf }, 
				{ 1, 0, inf, 2, inf, inf }, 
				{ inf, 2, 0, inf, inf, -8 },
				{ -4, inf, inf, 0, 3, inf }, 
				{ inf, 7, inf, inf, 0, inf }, 
				{ inf, 5, 10, inf, inf, 0 } };

		int[][] pred = { { -1, -1, -1, -1, 1, -1 }, { 2, -1, -1, 2, -1, -1 }, { -1, 3, -1, -1, -1, 3 },
				{ 4, -1, -1, -1, -1, -1 }, { -1, 5, -1, -1, -1, -1 }, { -1, 6, 6, -1, -1, -1 } };
		
		int[][] matrix2 = { 
				{ 0, 3, 8, inf, -4 }, 
				{ inf, 0, inf, 1, 7 }, 
				{ inf, 4, 0, inf, inf },
				{ 2, inf, -5, 0, inf }, 
				{ inf, inf, inf, 6, 0 } };

		int[][] pred2 = { 
				{ -1, 1, 1, -1, 1 }, 
				{ -1, -1, -1, 2, 2 }, 
				{ -1, 3, -1, -1, -1 },
				{ 4, -1, 4, -1, -1 }, 
				{ -1, -1, -1, 5, -1} };
		
		int[][] matrix3 = { 
				{ 0, 6, inf, 8,-1, inf}, 
				{ -2, 0, inf,2, -3, inf }, 
				{ 0, 2, 0, 4, -1, -8 },
				{ -4, 2, inf,0, -5, inf }, 
				{ 3, 7, inf, 9, 0, inf},
				{ 3, 5, 10, 7, 2, 0 } };
		
		int[][] pred3 = { 
				{ -1, 5, -1, 2, 1, -1 }, 
				{ 4, -1, -1, 2, 1, -1}, 
				{ 4, 3, -1, 2, 1, 3 },
				{ 4, 5, -1, -1, 1, -1 }, 
				{ 4, 5, -1, 2, -1, -1},
				{ 4, 6, 6, 2, 1, -1} };

		FloydWarshall floyd = new FloydWarshall(matrix3, pred3);
		floyd.calculate();

	}

}
