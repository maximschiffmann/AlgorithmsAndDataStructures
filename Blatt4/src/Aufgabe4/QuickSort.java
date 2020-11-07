package Aufgabe4;

import java.util.List;

public class QuickSort {
	private int part;

	private long sortCounter = 0;
	private long swapCounter = 0;
	private boolean run = true;
	private boolean finish = false;
	private long currentTime = 0;
	private long seconds = 60;
	private long time = System.nanoTime();

	public void sort(List<Integer> a, int first, int last) {
		if (!finish) {
			this.run = true;
			if (first < last) {
				this.part = this.preparePartition(a, first, last, part);
				if (!finish) {
					sort(a, first, this.part - 1);
					sort(a, this.part + 1, last);
				}
			}
		}
	}

	public int preparePartition(List<Integer> a, int first, int last, int part) {
		int pivot = a.get(first);
		part = first - 1;
		while (this.run) {
			for (int i = first; i <= last; i++) {
				this.currentTime = System.nanoTime();
				if (currentTime / 1000000000 >= time / 1000000000 + seconds + 1) {
					this.finish = true;
					this.run = false;
					break;
				}
				if (a.get(i) <= pivot) {
					part++;
					int temp = a.get(i);
					a.set(i, a.get(part));
					a.set(part, temp);
					this.swapCounter++;
				}
			}
			int temp = a.get(first);
			a.set(first, a.get(part));
			a.set(part, temp);
			this.sortCounter++;
			this.run = false;
		}
		return part;
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

	public void printTime() {
		System.out.println("sort counter: " + this.sortCounter);
		System.out.println("swap counter: " + this.swapCounter);
		System.out.println("stop at: " + (this.currentTime - this.time) / 1000000000 + " sec");
	}
}
