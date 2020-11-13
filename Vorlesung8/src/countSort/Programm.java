package countSort;

public class Programm {

	public static void main(String[] args) {
		CountSort cSort = new CountSort();
		int[] a = { 10, 9, 20, 0, 0, 11, 1, 70, 99, 150 };
		cSort.sort(a, a.length-1, 200);
		cSort.print(a);

	}

}
