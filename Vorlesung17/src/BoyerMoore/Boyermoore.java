package BoyerMoore;

public class Boyermoore {
	public int boyermooresearch(String text, int n, String muster, int m) {
		int i, j, sizeOfAlphabet = 28;
		int[] shift = new int[sizeOfAlphabet];

		for (i = 0; i < sizeOfAlphabet; i++) {
			shift[i] = m;
		}
		for (i = 0; i < m; i++) {
			shift[getIndex(muster.charAt(i))] = m - i - 1;
		}
//aaa
//bbb
		int count = 0;
		j = i = m - 1;
// j = i = 2, n = 15
		while (i < n) {
			if (text.charAt(i) == muster.charAt(j)) {
				if (j == 0) {
					count++;
					i += m;
					j = m - 1;
				} else {
					i--;
					j--;
				}
			} else {
				if (m - j > shift[getIndex(text.charAt(i))]) {
					i = i + m - j;
				} else {
					System.out.println(shift[getIndex(text.charAt(i))]);
					i = i + shift[getIndex(text.charAt(i))];
				}
				j = m - 1;
			}
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
