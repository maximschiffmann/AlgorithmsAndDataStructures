package heap;

public class Programm {

	public static void main(String[] args) {
		HeapSort heap = new HeapSort();
		int[] a = { 34, 45, 12, 34, 23, 18, 38, 17, 43, 7 };
		int[] b = { -5, 13, -32, 7, -3, 17, 23, 12, -35, 19 };
		int[] c = { 5, 4, 1, 3, 6, 2, 7, 8, 9, 10 };
		heap.hespSort(c, 0, c.length - 1);
		heap.print(c);
		System.out.println("end");

	}

}
