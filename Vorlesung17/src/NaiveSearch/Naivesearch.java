package NaiveSearch;

public class Naivesearch {
	public int naivesearch(String text, int n, String muster, int m) {
		int count = 0;
		for (int i = 0; i <= n - m; i++) {
			boolean match = true;
			for (int j = 0; j < m; j++) {
				if (text.charAt(i + j) != muster.charAt(j)) {
					match = false;
					break;
				}
			}
			if (match)
				count++;
		}
		return count;
	}
}
