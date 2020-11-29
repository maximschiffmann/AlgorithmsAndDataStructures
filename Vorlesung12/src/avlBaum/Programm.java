package avlBaum;

public class Programm {

	public static void main(String[] args) {
		AvlBaum tree = new AvlBaum();
		int[] a = { 6, 3, 1, 8, 7, 9 };

		for (int i = 0; i < a.length; i++) {
			tree.insert(a[i]);
		}
		tree.delete(6);
		tree.delete(7);
		tree.print();
	}

}
