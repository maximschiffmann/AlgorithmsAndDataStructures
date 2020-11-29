package aufgabe3;

public class Programm {

	public static void main(String[] args) {
		AvlBaum tree = new AvlBaum();
		int[] a = { 5, 6, 9, 12, 13, 3, 8, 10, 11, 16, 15, 14, 4, 2, 1 };

		for (int i = 0; i < a.length; i++) {
			tree.insert(a[i]);
		}
		tree.print();
		System.out.println();
		tree.delete(12);
		tree.delete(8);
		tree.delete(5);
		tree.delete(4);
		tree.delete(3);
		tree.delete(6);
		tree.delete(15);
		tree.delete(14);
		tree.print();
	}

}
