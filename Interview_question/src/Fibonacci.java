import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of terms in the Fibonacci sequence: ");
		int n = scanner.nextInt();

		System.out.println("Fibonacci sequence up to " + n + " terms:");
		for (int i = 0; i < n; i++) {
			System.out.print(fibonacci(i) + " ");
		}

		scanner.close();
	}

	public static int fibonacci(int n) {
		if (n <= 1) {
			return n;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}

//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//
//		System.out.print("Enter the number of terms in the Fibonacci sequence: ");
//		int n = scanner.nextInt();
//
//		System.out.println("Fibonacci sequence up to " + n + " terms:");
//		fibonacciIterative(n);
//
//		scanner.close();
//	}
//
//	public static void fibonacciIterative(int n) {
//		int first = 0, second = 1;
//		for (int i = 0; i < n; i++) {
//			System.out.print(first + " ");
//			int next = first + second;
//			first = second;
//			second = next;
//		}
//	}

}
