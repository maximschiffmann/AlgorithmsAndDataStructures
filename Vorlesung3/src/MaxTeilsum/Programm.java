package MaxTeilsum;

public class Programm {

	public static void main(String[] args) {
		int[] arr = { -13, 25, 34, 12, -3, 7, -87, 28, -77, 11 };
		int maxValue;
		MaxTeilsumAlgos algo = new MaxTeilsumAlgos(arr);
		maxValue = algo.MaxTeilsum1();
		System.out.println("Maximaler Wert: " + maxValue);
		maxValue = algo.MaxTeilsum2();
		System.out.println("Maximaler Wert: " + maxValue);
		maxValue = algo.MaxTeilsum3();
		System.out.println("Maximaler Wert: " + maxValue);
		maxValue = algo.MaxTeilsum4(arr, 0, arr.length - 1);
		System.out.println("Maximaler Wert: " + maxValue);

	}

}
