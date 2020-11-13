package aufgabe4;

public class Programm {

	public static void main(String[] args) {
		SumSearch sumCheck = new SumSearch();
		int[] a = { 20, 30, 10, 1, 2, 3, 4, 1, 70 };
		int sum = 100;
		System.out.println(sumCheck.findSum(a, sum));
	}
}
