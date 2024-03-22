package SEARCH;

public class BinarySearch {
	public static int search(int[] array, int val) {
		int start = 0;
		int end = array.length - 1;
		int mid;
		while (start <= end) {
			mid = (start + end) / 2;
			if (array[start] < array[end]) {
				if (array[mid] < val)
					start = mid + 1;
				else if (array[mid] > val)
					end = mid - 1;
				else
					return mid;
			} else {
				if (array[mid] < val)
					end = mid - 1;
				else if (array[mid] > val)
					start = mid + 1;
				else
					return mid;
			}
		}
		return -1;
	}
}
