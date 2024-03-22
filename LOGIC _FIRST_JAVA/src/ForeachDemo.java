import java.util.Scanner;

public class ForeachDemo {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		int sum = 0;
		Scanner Scan = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		for (int j : arr) {
			sum += j;
		}
		System.out.print(sum);
		Scan.close();
	}

}
