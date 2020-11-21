package aufgabe4;

public class Programm {

	public static void main(String[] args) {
		int numberOfItems = 100;
		Items items = new Items(numberOfItems);
		System.out.println("Items: ");
		items.print();
		Rucksack rucksack = new Rucksack(items.getItems(), 10);
		System.out.println("Value: " + rucksack.berechnen());

	}

}
