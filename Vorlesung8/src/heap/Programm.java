package heap;

public class Programm {

	public static void main(String[] args) {
		HeapSort heap = new HeapSort();
		int[] a = { 34, 45, 12, 34, 23, 18, 38, 17, 43, 7 };
		int[] b = { -5, 13, -32, 7, -3, 17, 23, 12, -35, 19 };
		heap.hespSort(b, 0, b.length - 1);
		heap.print(b);
		System.out.println("end");

	}

}
