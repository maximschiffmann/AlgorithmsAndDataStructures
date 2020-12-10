package aufgabe3;

public class Programm {

	public static void main(String[] args) {
		int[] a = { 10, 22, 31, 4, 15, 28, 17, 88, 59 };
		int m = 11;
		int c1 = 1;
		int c2 = 3;
		Linear linear = new Linear(m);
		for (int i = 0; i < a.length; i++) {
			linear.add(a[i]);
		}
		linear.print();

		Quadratisch quadratisch = new Quadratisch(m, c1, c2);
		for (int i = 0; i < a.length; i++) {
			quadratisch.add(a[i]);
		}
		quadratisch.print();
		
		Doppelt doppelt = new Doppelt(m);
		for (int i = 0; i < a.length; i++) {
			doppelt.add(a[i]);
		}
		doppelt.print();
	}

}
