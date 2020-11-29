package maxTeilsum2D;

public class Programm {

	public static void main(String[] args) {
		int[] arr = { -13, 25, 34, 12, -3, 7, -87, 28, -77, 11 }; // 75
		int[][] arr2d = { { -13, 25, 34, 12, -3 }, { 7, -87, 28, -77, 11 } };
		int[][] arr22d = { { 1, 2, -1, -4, -20 }, { -8, -3, 4, 2, 1 }, { 3, 8, 10, 1, 3 }, { -4, -1, 1, 7, -6 } }; // 29

		int[][] test = { { -2, 1, -3 }, { 5, -1, 2 }, { -1, -2, -1 }, { 3, 4, 1 }, { -1, 1, 4 } };

		int maxValue;
		MaxTeilsum2D algo = new MaxTeilsum2D(test);
		maxValue = algo.sum();
		System.out.println("Maximaler Wert: " + maxValue);
	}

}
