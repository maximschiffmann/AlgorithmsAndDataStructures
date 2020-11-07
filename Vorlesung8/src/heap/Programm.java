package heap;

public class Programm {

	public static void main(String[] args) {
		HeapSort heap = new HeapSort();
		int[] a = { 34, 45, 12, 34, 23, 18, 38, 17, 43, 7 };
		heap.hespSort(a, 0, a.length - 1);
		heap.print(a);
		System.out.println("end");

		
	}

}
