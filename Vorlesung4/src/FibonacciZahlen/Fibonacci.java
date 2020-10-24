package FibonacciZahlen;

public class Fibonacci {
	public int fibIterative(int n) {
		int i = 2;
		int result = 1;
		int f1 = 1;
		int f2 = 1;
		
		while(i<n) {
			i++;
			result = f1 + f2;
			f1 = f2;
			f2 = result;
		}
		return result;
	}
	
	public int fibRekursive(int n) {
		if(n<3) return 1;
		else return fibRekursive(n-1) + fibRekursive(n-2);
	}
}
