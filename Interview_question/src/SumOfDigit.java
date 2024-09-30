
public class SumOfDigit {

	public static int sumOfDigits(int number) {
		int sum = 0;
		while (number != 0) {
			sum += number % 10; 
			number /= 10; 
		}
		return sum;
	}

	public static void main(String[] args) {
		int number = 12345;
		int result = sumOfDigits(number);
		System.out.println("The sum of the digits of " + number + " is: " + result);
	}

}
