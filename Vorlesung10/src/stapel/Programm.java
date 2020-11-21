package stapel;

public class Programm {

	public static void main(String[] args) {
		Stapel stapel = new Stapel(10);

		stapel.push(3);
		stapel.push(2);
		stapel.push(1);
		stapel.push(1);
		stapel.pop();
		stapel.print();
		System.out.println(stapel.isEmpty());
		System.out.println(stapel.isFull());
	}

}
