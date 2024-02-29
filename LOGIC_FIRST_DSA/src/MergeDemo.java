import java.util.Arrays;

public class MergeDemo {

	public static void main(String[] args) {
		int array[] = { 5, 4, 7, 1 };
		MergeSort.mergeplace(array, 0, array.length);
		System.out.print(Arrays.toString(array));
	}

}
