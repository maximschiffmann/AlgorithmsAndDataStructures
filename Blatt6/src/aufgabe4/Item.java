package aufgabe4;

public class Item {
	private String name;
	private int wert;
	private int gewicht;

	public Item(String name, int wert, int gewicht) {
		this.name = name;
		this.wert = wert;
		this.gewicht = gewicht;
	}

	public String getName() {
		return name;
	}

	public int getWert() {
		return wert;
	}

	public int getGewicht() {
		return gewicht;
	}

	public void print() {
		System.out.println("Name: " + this.name + ", Wert: " + this.wert + ", Gewicht: " + this.gewicht);
	}

}
