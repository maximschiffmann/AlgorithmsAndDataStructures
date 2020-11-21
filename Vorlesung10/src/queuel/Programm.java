package queuel;

public class Programm {

	public static void main(String[] args) {
		Queuel queuel = new Queuel(10);

		for (int i = 1; i < 11; i++) {
			queuel.enqueue(i);
		}

		queuel.print();

		for (int i = 1; i < 11; i++) {
			queuel.dequeue();
			queuel.print();
			queuel.enqueue(i);
			queuel.print();
		}
	}

}
