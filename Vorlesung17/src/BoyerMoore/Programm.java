package BoyerMoore;

public class Programm {

	public static void main(String[] args) {
		Boyermoore search = new Boyermoore();
		String text = "wow wow wiw wow";
		String muster = "wow";
		
		int pos =search.boyermooresearch(text, text.length(), muster, muster.length());
		System.out.println(pos);
	}

}
