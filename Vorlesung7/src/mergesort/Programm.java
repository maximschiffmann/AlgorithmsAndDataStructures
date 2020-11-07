package mergesort;

public class Programm {

	public static void main(String[] args) {
		MergeSort merge = new MergeSort();
		 int[] a = { 34, 45, 12, 34, 23, 18, 38, 17, 43, 7 };
		//int[] a = { 3, 2, 1, 4 };
		int first = 0;
		int last = a.length - 1;
		merge.mergeSort(a, first, last);
		merge.print(a);
	}

}
