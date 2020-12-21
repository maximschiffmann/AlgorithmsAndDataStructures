package BoyerMoore;

public class Boyermoore {
	public int boyermooresearch(String text, int n, String muster, int m) {
		int i, j, sizeOfAlphabet = 28;
		int[] shift = new int[sizeOfAlphabet];
		boolean go = false;

		for (i = 0; i < sizeOfAlphabet; i++) {
			shift[i] = m;
		}
		for (i = 0; i < m; i++) {
			shift[getIndex(muster.charAt(i))] = m - i - 1;
		}

		for (int c = 0; c < shift.length; c++) {
			System.out.println(c + ": " + shift[c]);
		}

		System.out.println(text);
		int count = 0;
		j = i = m - 1;
// j = i = 2, n = 15
		while (i < n) {
			if (go) {
				for (int k = 0; k < i-j; k++) {
					System.out.print("*");
				}
			}
			System.out.println(muster);
			if (text.charAt(i) == muster.charAt(j)) {

				if (j == 0) {
					count++;
					i += m;
					j = m - 1;
					System.out.println();
				} else {
					i--;
					j--;
				}
			} else {

				if (m - j > shift[getIndex(text.charAt(i))]) {
					System.out.println("m: " + m + " j: " + j);
					i = i + m - j;
				} else {
					// System.out.println(shift[getIndex(text.charAt(i))]);
					i = i + shift[getIndex(text.charAt(i))];
					// System.out.println("else i: " + i);
				}
				j = m - 1;
			}
			go = true;
		}
		return count;
	}

	private int getIndex(char a) {
		if (a == ' ')
			return 26;
		if (a == ',')
			return 27;
		int r = 0;
		if (a >= 'A' && a <= 'Z') {
			r = (int) a - 'A';
		} else if (a >= 'a' && a <= 'z') {
			r = (int) a - 'a';
		}
		return r;
	}
}
