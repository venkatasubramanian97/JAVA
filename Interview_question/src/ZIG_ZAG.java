
public class ZIG_ZAG {

	public static void main(String[] args) {
		int[] arr = { 4, 3, 7, 8, 6, 2, 1 };

		System.out.println("Original array:");
		printArray(arr);

		convertToZigZag(arr);

		System.out.println("Zig-Zag array:");
		printArray(arr);
	}

	public static void convertToZigZag(int[] arr) {
		boolean flag = true;
		for (int i = 0; i < arr.length - 1; i++) {
			if (flag) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			} else {
				if (arr[i] < arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
			flag = !flag;
		}
	}

	public static void printArray(int[] arr) {
		for (int element : arr) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
}
