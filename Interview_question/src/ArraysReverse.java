import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysReverse {
//
//	    public static void reverse(int[] array) {
//	        int n = array.length;
//	        for (int i = 0; i < n / 2; i++) {
//	            int temp = array[i];
//	            array[i] = array[n - 1 - i];
//	            array[n - 1 - i] = temp;
//	        }
//	    }
//
//	    public static void main(String[] args) {
//	        int[] array = {1, 2, 3, 4, 5};
//	        System.out.println("Original array: " + Arrays.toString(array));
//	        reverse(array);
//	        System.out.println("Reversed array: " + Arrays.toString(array));
//	    }

//	public static void reverse(int[] array, int start, int end) {
//		if (start >= end) {
//			return;
//		}
//		int temp = array[start];
//		array[start] = array[end];
//		array[end] = temp;
//		reverse(array, start + 1, end - 1);
//	}
//
//	public static void main(String[] args) {
//		int[] array = { 1, 2, 3, 4, 5 };
//		System.out.println("Original array: " + Arrays.toString(array));
//		reverse(array, 0, array.length - 1);
//		System.out.println("Reversed array: " + Arrays.toString(array));
//	}

	public static void reverse(Integer[] array) {
		List<Integer> list = Arrays.asList(array);
		Collections.reverse(list);
		array = list.toArray(array);
	}

	public static void main(String[] args) {
		Integer[] array = { 1, 2, 3, 4, 5 };
		System.out.println("Original array: " + Arrays.toString(array));
		reverse(array);
		System.out.println("Reversed array: " + Arrays.toString(array));
	}
}
