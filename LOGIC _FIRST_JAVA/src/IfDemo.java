import java.util.Scanner;

public class IfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mark;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the mark : ");
		mark = scanner.nextInt();
		if (mark >= 90)
			System.out.println("Grade A");
		else if (mark >= 80 && mark < 90)
			System.out.println("Grade B");
		else if (mark >= 70)
			System.out.println("Grade C");
		else if (mark >= 60)
			System.out.println("Grade D");
		else
			System.out.println("Grade E");
		scanner.close();
	}

}
