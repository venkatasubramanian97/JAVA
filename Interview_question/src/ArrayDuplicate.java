import java.util.Arrays;
import java.util.LinkedHashSet;

public class ArrayDuplicate {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 2, 5, 6, 3, 7, 1 };

		System.out.println("Original Array: " + Arrays.toString(array));

		array = removeDuplicates(array);

		System.out.println("Array after removing duplicates: " + Arrays.toString(array));
	}

	public static int[] removeDuplicates(int[] array) {
		LinkedHashSet<Integer> set = new LinkedHashSet<>();

		for (int num : array) {
			set.add(num);
		}

		int[] result = new int[set.size()];
		int index = 0;
		for (int num : set) {
			result[index++] = num;
		}

		return result;
	}
}
