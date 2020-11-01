package aufgabe4;

public class Programm {
	public static void main(String[] args) {
		int n = 0;
		int m = 0;
		Func func = new Func();
		int output = func.rec(n, m);
		System.out.println(output);
		int outputIter = func.iter(n, m);
		System.out.println(outputIter);
	}

}
