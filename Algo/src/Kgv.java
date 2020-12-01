
public class Kgv {
	public static int kgv(int a, int b) {
		return a * (b / ggt(a, b));
	}

	public static int ggt(int a, int b) {
		int r = 1;
		while (r > 0) {
			r = a % b;
			a = b;
			b = r;
		}
		return a;
	}
}
