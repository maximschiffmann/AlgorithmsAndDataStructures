
public class SiebDesEratostehenes {

	public static void main(String[] args) {
		printPrime(100000);
	}
	
	public static void printPrime(int k) {
		boolean prime = false;
		for(int i = 2; i <= k; i++) {
			for(int j = 2; j < k; j++) {
				if(i % j == 0 && i != j) {
					break;
				} else {
					prime = true;
				}
			}
			if(prime) {
				System.out.println(i);
				prime = false;
			}
		}
	}
}
