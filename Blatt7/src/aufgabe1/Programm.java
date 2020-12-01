package aufgabe1;

public class Programm {

	public static void main(String[] args) {
		Searchtree tree = new Searchtree();
		int[] a = { 8, 5, 7, 6, 9, 11, 10, 12 };

		for (int i = 0; i < a.length; i++) {
			tree.insert(a[i]);
		}

		System.out.println("In: ");
		tree.print();
		System.out.println();
		System.out.println("Pre: ");
		tree.printPre();
		System.out.println();
		System.out.println("Post: ");
		tree.printPost();
		System.out.println();
		tree.deleteValueIter(6);
		tree.print();
	}
}
