package SORTDEMO;

import java.util.Arrays;

public class MergeSort {

	public static int[] merge(int[] arr) {
		if (arr.length == 1)
			return arr;

		int mid = arr.length / 2;

		int[] left = merge(Arrays.copyOfRange(arr, 0, mid));
		int[] rigth = merge(Arrays.copyOfRange(arr, mid, arr.length));

		return sort(left, rigth);
	}

	public static int[] sort(int[] first, int[] second) {
		int[] joined = new int [first.length + second.length];
		int i = 0, j = 0, k = 0;
		while (i < first.length && j < second.length) {
			if (first[i] < second[j])
				joined[k++] = first[i++];
			else
				joined[k++] = second[j++];
		}

		while (i < first.length)
			joined[k++] = first[i++];
		while (j < second.length)
			joined[k++] = second[j++];
		return joined;
	}
	
	public static void sort1(int[] arr, int start, int end) {
	if (end - start == 1)
		return;

	int mid = (start + end) / 2;

	sort1(arr, start, mid);
	sort1(arr, mid, end);
	merge1(arr, start, mid, end);
}

public static void merge1(int[] arr, int s, int m, int e) {
	int[] joined = new int[e - s];
	int i = s, j = m, k = 0;
	while (i < m && j < e) {
		if (arr[i] < arr[j])
			joined[k++] = arr[i++];
		else
			joined[k++] = arr[j++];
	}

	while (i < m)
		joined[k++] = arr[i++];
	while (j < e)
		joined[k++] = arr[j++];
	for (k = 0; k < joined.length; k++)
		arr[s + k] = joined[k];
}

}
