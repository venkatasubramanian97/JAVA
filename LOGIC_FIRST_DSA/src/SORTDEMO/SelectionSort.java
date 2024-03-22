package SORTDEMO;

public class SelectionSort {
	
	public static void sort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int midsize = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[midsize])
					midsize = j;
			}
			int temp = array[i];
			array[i] = array[midsize];
			array[midsize] = temp;
		}
	}
	
}
