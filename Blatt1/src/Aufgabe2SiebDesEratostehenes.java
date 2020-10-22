public class Aufgabe2SiebDesEratostehenes {

	public static void main(String[] args) {
		//printPrime(100000);
		sieb(100000);
	}
	
	// Meine ursprüngliche Lösung, für Abgabe nicht gültig
	public static void printPrime(int k) {
		boolean prime = false;
		for(int i = 2; i <= k; i++) {
			for(int j = 2; j < k; j++) {
				if(i % j == 0 && i != j) {
					prime = false;
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
	
	// Nachträgliche Korrektur nach Absprache mit Herrn Volbert
	public static void sieb(int k) {
		int j = 2;
		
		int[] arr = new int[k];
		
		for(int i = 2; i < k; i++) {
			arr[i] = i;
		}
		
		while(j < k/2) {
			for(int i = 2 * j; i < k; i += j) {
				arr[i] = 0;
				// System.out.println("i: " + i);
			}
			j++;
			while(arr[j] == 0) {
				j++;
			}
			// System.out.println("j: " + j);
		}
		for(int i = 0; i < k; i++) {
			if(arr[i] != 0) {
				System.out.println(arr[i]);
			}
		}
	}
}
