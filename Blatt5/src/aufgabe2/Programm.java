package aufgabe2;

public class Programm {

	public static void main(String[] args) {
		InsertionSort inSort = new InsertionSort();
		int[] a = { 3, 2, 1, 4, 10, 100, 90 };
		// inSort.inSort(a);
		// inSort.inSortRec(a, a.length);
		MergeSort mSort = new MergeSort();
		//mSort.sort(a, 0, a.length - 1);
		mSort.sortItr(a);
		inSort.print(a);

	}

}
