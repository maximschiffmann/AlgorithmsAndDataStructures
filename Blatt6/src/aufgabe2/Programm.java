package aufgabe2;

public class Programm {

	public static void main(String[] args) {
		int[] a = { 34, 45, 12, 34, 23, 18, 38, 17, 43, 7 };
		LinkedListN list = new LinkedListN();
		for (int num : a) {
			list.add(num);
		}
		list.print();

		QuickSort qSort = new QuickSort();
		qSort.sort(list, 0, list.length() - 1);
		list.print();
	}

}
