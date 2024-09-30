
public class Factorial {

//	public static void main(String[] args) {
//		int number = 5; 
//		long result = factorialIterative(number);
//		System.out.println("Factorial of " + number + " is: " + result);
//	}
//
//	public static long factorialIterative(int n) {
//		long result = 1;
//		for (int i = 1; i <= n; i++) {
//			result *= i;
//		}
//		return result;
//	}

	public static void main(String[] args) {
		int number = 5; 
		long result = factorialRecursive(number);
		System.out.println("Factorial of " + number + " is: " + result);
	}

	public static long factorialRecursive(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * factorialRecursive(n - 1);
		}
	}
}
