import java.util.Arrays;

public class SortDemo {

	public static void main(String[] args) {
		int array[] = { 10, 15, 4, 9, 23 };
		SortSelection.sort(array);
		System.out.print(Arrays.toString(array));
		System.out.println("\n");
		SortSelection.bubble(array);
		System.out.print(Arrays.toString(array));
		System.out.println("\n");
		SortSelection.insertion(array);
		System.out.print(Arrays.toString(array));
		
	}

}
