package FibonacciZahlen;

public class Programm {

	public static void main(String[] args) {
		Fibonacci fib = new Fibonacci();
		int result;
		for (int i = 1; i < Integer.MAX_VALUE; i++) {
			result = fib.fibIterative(i);
			System.out.println(result);
			if (result < 0) {
				System.out.println("Negative at: " + i);
				break;
			}
		}

		for (int i = 1; i < Integer.MAX_VALUE; i++) {
			result = fib.fibRekursive(i);
			System.out.println(result);
			if (result < 0) {
				System.out.println("Negative at: " + i);
				break;
			}
		}

	}

}
