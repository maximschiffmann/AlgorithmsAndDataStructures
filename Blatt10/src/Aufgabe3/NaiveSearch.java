package Aufgabe3;

public class NaiveSearch {
	public int naivesearch(String text, String pattern) {
		int count = 0, i, j = 0;
		System.out.println(text);
		for (i = 0; i <= text.length() - pattern.length(); i += Math.min(pattern.length(), j + 1)) {

			// System.out.println("i: " + i + " " + (text.length() - pattern.length()));

			boolean match = false;
			boolean printStar = true;
			for (j = 0; j < pattern.length(); j++) {
				if (text.charAt(i + j) != pattern.charAt(j)) {
					break;
				} else {
					if (printStar) {
						for (int k = 0; k < i; k++) {
							System.out.print("*");
						}
						printStar = false;
					}
					System.out.print(pattern.charAt(j));
					match = true;
				}
				if (j == pattern.length() - 1) {
					count++;
				}
			}
			if (match)
				System.out.println();
		}
		System.out.println();
		return count;
	}
}
