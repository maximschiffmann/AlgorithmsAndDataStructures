package aufgabe4;

import java.util.ArrayList;

public class Rucksack {
	private Item[] items;
	private int volumen;

	public Rucksack(Item[] items, int rucksackGewicht) {
		this.items = items;
		this.volumen = rucksackGewicht;
	}

	public int berechnen() {
		int i;
		int w;
		int n = items.length;
		int k[][] = new int[n + 1][volumen + 1];
		ArrayList<Item> temp = new ArrayList<Item>();

		for (i = 0; i <= n; i++) {
			for (w = 0; w <= volumen; w++) {
				if (i == 0 || w == 0) {
					k[i][w] = 0;
				} else if (items[i - 1].getGewicht() <= w) {
					// System.out.print("Item: I: " + i + " w: " + w + " :");
					// items[i - 1].print();
					int max = Math.max(items[i - 1].getWert() + k[i - 1][w - items[i - 1].getGewicht()], k[i - 1][w]);
					k[i][w] = max;
				} else {
					k[i][w] = k[i - 1][w];
				}
			}
		}
		// print(k);
		 	/*
			 * int sum = 0; for (i = 1; i <= volumen; i++) { for (int j = 0; j < n; j++) {
			 * if (k[n][i] - sum == items[j].getWert()) { temp.add(items[j]); sum +=
			 * items[j].getWert(); } } } System.out.println("Backpack: "); for (Item s :
			 * temp) { s.print(); }
			 */
			return k[n][volumen];
	}
	public void print(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

}
