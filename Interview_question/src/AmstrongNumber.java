import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		for (int i = 0; i < number; i++) {
			if (isArmstrong(i)) {
				System.out.print(i + " ");
			}
		}
		scanner.close();
	}

	public static boolean isArmstrong(int num) {
		int originalNumber = num;
		int numberOfDigits = countDigits(num);
		int sum = 0;

		while (num != 0) {
			int digit = num % 10;
			sum += Math.pow(digit, numberOfDigits);
			num /= 10;
		}

		return sum == originalNumber;
	}

	public static int countDigits(int num) {
		int count = 0;

		while (num != 0) {
			num /= 10;
			count++;
		}
		return count;
	}
}
//
//output:
//	Enter a number: 1000
//	0 1 2 3 4 5 6 7 8 9 153 370 371 407 
