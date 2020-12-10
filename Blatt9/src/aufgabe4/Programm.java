package aufgabe4;

public class Programm {

	public static void main(String[] args) {
		SkipList sl = new SkipList();

		sl.insert(0);
		sl.insert(3);
		sl.insert(18);
		sl.insert(20);
		sl.insert(8);
		sl.insert(9);
		sl.insert(13);
		sl.insert(17);

		sl.printlist();
		System.out.println();

		sl.delete(17);
		sl.printlist();
	}
}
