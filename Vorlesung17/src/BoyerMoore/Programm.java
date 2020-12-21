package BoyerMoore;

public class Programm {

	public static void main(String[] args) {
		Boyermoore search = new Boyermoore();
		String text = "EIN MUSTER P WIRD IN EINEM GEGEBENEN TEXT GESUCHT";
		String muster = "KEIN";
		
		int pos =search.boyermooresearch(text, text.length(), muster, muster.length());
		System.out.println(pos);
	}

}
