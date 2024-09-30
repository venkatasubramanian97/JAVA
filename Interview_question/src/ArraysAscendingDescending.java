//import java.util.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArraysAscendingDescending {

	public static void main(String[] args) {
		Integer[] array = { 5, 3, 8, 1, 2 };

		Arrays.sort(array);

		System.out.println("Array in ascending order: " + Arrays.toString(array));

		Arrays.sort(array, Collections.reverseOrder());

		System.out.println("Array in descending order: " + Arrays.toString(array));
		
		Arrays.sort(array);

		System.out.println("Array in ascending order: " + Arrays.toString(array));
		
		Arrays.sort(array, Comparator.reverseOrder());

		System.out.println("Array in descending order: " + Arrays.toString(array));
	}

}
