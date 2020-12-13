package NaiveSearch;

public class Programm {

	public static void main(String[] args) {
		Naivesearch search = new Naivesearch();
		String text = "wow wow wiw wow";
		String muster = "wow";
		
		int pos = search.naivesearch(text, text.length(), muster, muster.length());
		System.out.println(pos);
	}

}
