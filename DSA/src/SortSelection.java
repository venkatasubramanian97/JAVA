
public class SortSelection {
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

			if (!swap) {
				break;
			}
		}
	}

	public static void insertion(int[] array) {
		for (int i = 1; i < array.length; i++) {
			for (int j = i; j > 0; j--) {
				if (array[j] < array[j - 1]) {
					int temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
				} else
					break;
			}
		}
	}
}
