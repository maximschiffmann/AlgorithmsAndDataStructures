package Aufgabe4;

import java.util.List;

public class Programm {

	public static void main(String[] args) {
		int n = 800000;
		RandomNumbers rnd = new RandomNumbers(n);
		
		System.out.println("BubbleSort:");
		List<Integer> arr = rnd.genList();
		BubbleSort bSort = new BubbleSort();
		bSort.sort(arr);
		//bSort.print(arr);
		// sort counter: 1176
		// swap counter: 1110643289
		
		System.out.println("QuickSort:");
		List<Integer> list = rnd.genList();
		QuickSort qSort = new QuickSort();
		qSort.sort(list, 0, list.size()-1);
		qSort.printTime();
		// qSort.print(list);
		// sort counter: 1808538
		// swap counter: 1159159840
	}
}
