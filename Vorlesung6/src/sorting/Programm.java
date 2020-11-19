package sorting;

public class Programm {

	public static void main(String[] args) {
		int[] arr = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
		InsertionSort sorter = new InsertionSort(arr);
		//sorter.sort();

		int[] arr2 = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
		BubbleSort bsorter = new BubbleSort(arr2);
		// bsorter.sort();

		int[] arr3 = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
		SelectionSort sSorter = new SelectionSort(arr3);
		// sSorter.sort();
		
		int[] arr4 = { 34, 45, 12, 34, 23, 18, 38, 17, 43, 7 };
		Quicksort qSorter = new Quicksort();
		qSorter.sort(arr4, 0, arr4.length-1);
	}

}
