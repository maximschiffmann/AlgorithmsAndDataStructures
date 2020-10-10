public class Aufgabe1GGT {

	public static void main(String[] args) {
		int a = 30;
		int b = 40;
		int result = ggt(a, b);
		int resultR = ggtR(a, b);
		System.out.println("ggt: " + result);
		System.out.println("ggtR: " + resultR);

		int resultkgv = kgv(a, b);
		System.out.println("kgv: " + resultkgv);

	}
	
	public static int ggt(int a, int b) {
		int r = 1;
		while(r != 0) {
			r = a % b;
			a = b;
			b = r;
		}
		return a;
	}
	
	public static int ggtR(int a, int b) {
		if(b == 0) return a;
		return ggtR(b, a%b);
	}
	
	public static int kgv(int a, int b) {
		return a * (b / ggt(a, b));
	}
}
