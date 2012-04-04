package sortnsearch;

public class SelectionSorter {

	private int[] a;
	
	public SelectionSorter(int[] anArray) {
		a = anArray;
	}
	
	public void sort() {
		for (int i = 0; i< a.length - 1; i++) {
			int minPos = minimumPosition(i);
			swap(minPos, i);
		}
	}
	
	private int minimumPosition(int from) {
		int minPos = from;
		for (int i = from +1; i < a.length; i++) {
			if (a[i] < a[minPos]) minPos = i;
		}
		return minPos;
	}
	
	private void swap(int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}