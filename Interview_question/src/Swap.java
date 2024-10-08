
public class Swap {
	public static void main(String[] args) {
		int a = 5;
		int b = 10;

		System.out.println("Before Swap: a = " + a + ", b = " + b);

		int temp = a;
		a = b;
		b = temp;

		System.out.println("After Swap: a = " + a + ", b = " + b);

		a = 5;
		b = 10;

		System.out.println("Before Swap: a = " + a + ", b = " + b);

		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After Swap: a = " + a + ", b = " + b);

		a = 5;
		b = 10;

		System.out.println("Before Swap: a = " + a + ", b = " + b);

		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("After Swap: a = " + a + ", b = " + b);

	}
}