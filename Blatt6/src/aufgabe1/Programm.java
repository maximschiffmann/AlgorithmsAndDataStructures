package aufgabe1;

public class Programm {

	public static void main(String[] args) {
		int[] a = { 4, 9, 2, 4, 7, 6, 0, 12 };
		CountSort cSort = new CountSort();
		cSort.sortNew(a);
		cSort.print(a);

		HeapSort hSort = new HeapSort();
		// hSort.sort(a, 0, a.length - 1);
		// hSort.print(a);

		MapSort mSort = new MapSort();
		// mSort.print(a);
		// mSort.sort(a, a.length, 1.5);
		// mSort.print(a);

	}

}
