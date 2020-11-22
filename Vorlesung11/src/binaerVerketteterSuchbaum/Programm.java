package binaerVerketteterSuchbaum;

public class Programm {

	public static void main(String[] args) {
		Searchtree tree = new Searchtree();
		int[] a = { 6, 3, 1, 8, 7, 9 };

		for (int i = 0; i < a.length; i++) {
			tree.insert(a[i]);
		}

		tree.print();
		System.out.println();
		tree.printPre();
		System.out.println();
		tree.printPost();
		System.out.println();
		tree.deleteValue(6);
		tree.print();
	}
}
