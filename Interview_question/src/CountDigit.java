import java.util.Scanner;

public class CountDigit {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number = scanner.nextInt();

		int digitCount = countDigits(number);

		System.out.println("Number of digits: " + digitCount);

		scanner.close();
	}

	public static int countDigits(int num) {
		if (num < 0) {
			num = -num;
		}

		if (num == 0) {
			return 1;
		}

		int count = 0;

		while (num != 0) {
			num /= 10;
			count++;
		}

		return count;
	}

}
