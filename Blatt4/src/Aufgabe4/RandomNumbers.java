package Aufgabe4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumbers {
	private int n;
	private int[] arr;
	private List<Integer> list = new ArrayList<>();

	public RandomNumbers(int n) {
		this.n = n;
		this.arr = new int[n];
	}

	public int[] gen() {
		Random r = new Random();
		for (int i = 0; i < n; i++) {
			this.arr[i] = Math.abs(r.nextInt(100));
		}
		return this.arr;
	}
	
	public List<Integer> genList() {
		Random r = new Random();
		for (int i = 0; i < n; i++) {
			int num = Math.abs(r.nextInt(1000));
			this.list.add(num);
		}
		return this.list;
	}

	public void print(long[] a) {
		for (long num : a) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

	public void print() {
		for (long num : this.arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
}
