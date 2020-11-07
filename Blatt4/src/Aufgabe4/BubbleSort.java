package Aufgabe4;

import java.util.List;

public class BubbleSort {
	public void sort(List<Integer> a) {
		long sortCounter = 0;
		long swapCounter = 0;
		boolean run = true;
		long currentTime = 0;
		long seconds = 60;
		long time = System.nanoTime();
		while (run) {
			for (int i = 0; i < a.size(); i++) {
				for (int j = a.size() - 2; j >= i; j--) {
					currentTime = System.nanoTime();
					if (currentTime / 1000000000 >= time / 1000000000 + seconds + 1) {
					//	System.out.println("check");
						run = false;
						break;
					}
					if (a.get(j) > a.get(j + 1)) {
						int temp = a.get(j);
						a.set(j, a.get(j + 1));
						a.set(j + 1, temp);
						swapCounter++;
						// this.print(a);
					}
				}
				sortCounter++;
				if(!run) break;
			}
			run = false;
		}
		System.out.println("sort counter: " + sortCounter);
		System.out.println("swap counter: " + swapCounter);
		System.out.println("stop at: " + (currentTime - time) / 1000000000 + " sec");
	}

	public void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	public void print(List<Integer> arr) {
		for (int i = 0; i < arr.size(); i++) {
			System.out.print(arr.get(i) + " ");
		}
		System.out.println();
	}
}
