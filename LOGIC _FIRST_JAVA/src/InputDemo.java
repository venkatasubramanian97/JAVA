//import java.util.*;
//public class InputDemo {
//	public static void main (String args[]) {
//		@SuppressWarnings("resource")
//		Scanner Obj = new Scanner(System.in);
//		System.out.print("Enter your name :");
//		String name=Obj.nextLine();
//		System.out.print("Enter your age :");
//		int age=Obj.nextInt();
//		System.out.print("Enter the email :");
//		Obj.nextLine();
//		String email=Obj.nextLine();
//		System.out.println("Name : "+name);
//		System.out.println("Age : "+age);
//		System.out.println("Email : "+email);
//		}
//
//}

// Java program to demonstrate BufferedReader
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class InputDemo{
	public static void main(String[] args)
		throws IOException
	{
		// Enter data using BufferReader
		BufferedReader reader = new BufferedReader(
			new InputStreamReader(System.in));

		// Reading data using readLine
		String name = reader.readLine();

		// Printing the read line
		System.out.println(name);
	}
}
