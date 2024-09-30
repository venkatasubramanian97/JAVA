import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number range 1 to : ");
		int number = scanner.nextInt();
		System.out.print("The is a prime number.");
		for (int i = 2; i <= number; i++) {
			if (isPrime(i)) {
				System.out.print(i+" ");
			}
		}
//		else {
//			System.out.println(number + " is not a prime number.");
//		}

		scanner.close();
	}

	public static boolean isPrime(int number) {
		if (number < 2) {
			return false;
		}

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}

		return true;
	}

}
