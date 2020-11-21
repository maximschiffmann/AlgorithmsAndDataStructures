package aufgabe4;

public class Items {
	private Item[] items;
	private int anzahl;
	private String[] namen = { "Aufnehmer", "Bratenwender", "Butterdose", "Eierkocher", "Eieruhr", "Eierbecher",
			"Haushaltschere", "Kartoffelstampfer", "Küchentücher", "Nagelschere", "Nähgarn", "Nähnadeln", "Rührlöffel",
			"Staubtuch", "Tee-Ei", "Tee-Sieb", "Tee-Kanne", "Toaster", "Wäschekorb" };
	private int namenLength = namen.length;
	private int max = 10;
	private int min = 1;

	public Items(int anzahl) {
		this.anzahl = anzahl;
		items = new Item[anzahl];
		init();
	}

	public void init() {
		for (int i = 0; i < anzahl; i++) {
			String name = namen[(int) (Math.random() * (namenLength -1 + 1) + 0)];
			int wert = (int) (Math.random() * (max - min + 1) + min);
			int gewicht = (int) (Math.random() * (max - min + 1) + min);
			items[i] = new Item(name, wert, gewicht);
		}
	}
	
	public Item[] getItems() {
		return items;
	}

	public void print() {
		for (int i = 0; i < anzahl; i++) {
			items[i].print();
		}
	}
}
