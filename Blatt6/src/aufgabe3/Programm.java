package aufgabe3;

public class Programm {

	public static void main(String[] args) {
		int max = 10000;
		int min = 100;
		RingListe list = new RingListe();
		for (int i = 1; i <= 49; i++) {
			list.add(i);
		}
		System.out.println("Start:");
		list.print();

		for (int i = 0; i < 6; i++) {
			int num = (int) (Math.random() * (max - min + 1) + min);
			System.out.println("Number " + i + ": " + list.pickNumber(num));
		}
		System.out.println("Finish:");
		list.print();

	}

}
