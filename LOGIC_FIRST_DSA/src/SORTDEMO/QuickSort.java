package SORTDEMO;

public class QuickSort {
	public static void quick(int[] arr, int low, int high) {
		if (low >= high)
			return;
		int start = low;
		int end = high;
		int mid = (start + end) / 2;
		int pivot = arr[mid];

		while (start <= end) {
			while (arr[start] < pivot)
				start++;
			while (arr[end] > pivot) 
				end--;
			if (start <= end) {
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				start++;
				end--;
			}
			

		}
		quick(arr,low,end);
		quick(arr,start,high);
	}
}
