package Aufgabe3;

public class Programm {

	public static void main(String[] args) {
		NaiveSearch search = new NaiveSearch();
		String text = "Das ist ein langer text";
		String pattern = "ein";
		int pos = search.naivesearch(text, pattern);
		System.out.println("Anzahl treffer: " + pos);
	}

}
