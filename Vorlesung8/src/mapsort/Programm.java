package mapsort;

public class Programm {
	public static void main(String[] args) {
		MapSort mSort = new MapSort();
		int[] a = { 10, 9, 20, 0, 0, 11, 1, 70, 99, 150 };
		mSort.sort(a, a.length, 1.7);
		mSort.print(a);
	}
}
