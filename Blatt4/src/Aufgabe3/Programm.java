package Aufgabe3;

import java.util.Random;

public class Programm {

	public static void main(String[] args) {
		InsertionSortMinimum inSort = new InsertionSortMinimum();
		int[] a = { 34, 45, 12, 34, 23, 18, 38, 17, 43, 51 };
		// inSort.sort(a);
		inSort.print(a);

		BubbleSortMaximum bSort = new BubbleSortMaximum();
		// bSort.sort(a);
		// bSort.print(a);

		SelectionSortMaximum sSort = new SelectionSortMaximum();
		// sSort.sort(a);
		// sSort.print(a);

		QuickSortRand qSort = new QuickSortRand();
		//Random rand = new Random();
		//int first = rand.nextInt(a.length)+1;
		int first = 0;
		qSort.sort(a, first, a.length - 1);
		qSort.print(a);
		

	}

}
