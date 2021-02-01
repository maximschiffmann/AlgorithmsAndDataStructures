package mapsort;

public class Programm {
	public static void main(String[] args) {
		MapSort mSort = new MapSort();
		// int[] a = { 10, 9, 20, 0, 0, 11, 1, 70, 99, 150 };
		int[] a = { 34, 45, 12, 34, 23, 18, 38, 17, 43, 7 };
		mSort.sort(a, a.length, 1.0);
		mSort.print(a);
	}
}
