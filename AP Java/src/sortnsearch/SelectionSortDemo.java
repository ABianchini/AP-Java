package sortnsearch;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;


public class SelectionSortDemo {
	public static void main(String[] args) {
		int[] a = ArrayUtil.randomIntArray(20, 100);
		System.out.println(Arrays.toString(a));
		
		SelectionSorter sorter = new SelectionSorter(a);
		Date date = Calendar.getInstance().getTime();
		sorter.sort();
		Date date2 = Calendar.getInstance().getTime();
		System.out.println(Arrays.toString(a));
		System.out.println(date - date2);
	}
}
