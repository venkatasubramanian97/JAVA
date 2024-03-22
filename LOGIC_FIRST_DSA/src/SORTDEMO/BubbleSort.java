package SORTDEMO;

public class BubbleSort {

	public static void bubble(int[] array) {

		for (int i = 0; i < array.length; i++) {
			boolean swap = false;
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j + 1]) {
					swap = true;
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}

			if (!swap)
				break;
		}
	}

}
