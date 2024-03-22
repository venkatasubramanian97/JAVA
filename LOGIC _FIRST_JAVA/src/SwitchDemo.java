import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		char c;
		System.out.println("Enter the character : ");
		c = scanner.next().charAt(0);
		switch (c) {
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U': {
			System.out.println("Characters a vowels ");
			break;
		}
		default:
			System.out.println("not ");

		}
		scanner.close();
	}

}
