
public class Ggt {
	public int ggt(int a, int b) {
		int r = 1;
		while (r > 0) {
			r = a % b;
			a = b;
			b = r;
		}
		return a;
	}

	public int ggtRec(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return ggtRec(b, a % b);
		}
	}

}
