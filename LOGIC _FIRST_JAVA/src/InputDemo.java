import java.util.Scanner;
import java.io.*;
public class InputDemo {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
//		System.out.println("What is ypur name? ");
//		String name = scanner.next();
//		System.out.println("hello name : "+name);
//		System.out.println("What is ypur rating 1 to 5: ");
//		int rating=scanner.nextInt();
//		System.out.println("you rating point :"+rating);
//		
		
//		// bufferedrader user input 
//		BufferedReader reader = new BufferedReader(
//			new InputStreamReader(System.in));
//		System.out.println("Enter the name : ");
//		String names=reader.readLine();
//		System.out.println(names);
		System.out.print("Entert the number in pramyid : ");
		int a=scanner.nextInt();
		for(int i=1;i<=a;i++) {
			for(int j=i;j<a;j++)
				System.out.print("\t");
			for(int j=1;j<i;j++)
				System.out.print(j+"\t");
			for(int j=i;j>0;j--)
				System.out.print(j+"\t");
			System.out.print("\n");
		}
		scanner.close();
	}
}
