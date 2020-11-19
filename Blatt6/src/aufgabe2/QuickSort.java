package aufgabe2;

public class QuickSort {
	private int part;

	public void sort(LinkedListN a, int first, int last) {
		if (first < last) {
			this.part = this.preparePartition(a, first, last, part);
			sort(a, first, this.part - 1);
			sort(a, this.part + 1, last);
		}
	}

	private int preparePartition(LinkedListN a, int first, int last, int part) {
		int pivot = a.findByIndex(first).getData();
		part = first - 1;
		a.setCurrent(a.getFirst());
		for (int i = first; i <= last; i++) {
			int data = a.findByIndex(i).getData();
			if (data <= pivot) {
				part++;
				int temp = data;
				a.findByIndex(i).setData(a.findByIndex(part).getData());
				a.findByIndex(part).setData(temp);
			}
		}
				
		int temp = a.findByIndex(first).getData();
		a.findByIndex(first).setData(a.findByIndex(part).getData());
		a.findByIndex(part).setData(temp);
		return part;
	}
}
