
public class Sieb {
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
