package zoho;

import java.util.Scanner;

public class VersionComparison {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the input 1 : ");
		String input1 = scan.next();
		System.out.print("Enter the input2 : ");
		String input2 = scan.next();
		int result = compareversion(input1, input2);
		if (result > 0) {
			System.out.println(input1 + " is greater than " + input2);
		} else if (result < 0) {
			System.out.println(input2 + " is greater than " + input1);
		} else {
			System.out.println(input1 + " is equal to " + input2);
		}
		scan.close();
	}

	public static int compareversion(String input1, String input2) {
		String f = "", s = "";
		int j = 0, k = 0, size = 0,count1=1,count2=1;
		
		for (int i = 0; i < input1.length(); i++) {
			if (input1.charAt(i) == ':') {
				count1++;
			}
		}
		for (int i = 0; i < input2.length(); i++) {
			if (input2.charAt(i) == ':') {
				count2++;
			}
		}

		String[] first = new String[count1];
		String[] second = new String[count2];
		for (int i = 0; i < input1.length(); i++) {
			if (input1.charAt(i) != ':') {
				f += input1.charAt(i);
				if (i == input1.length() - 1) {
					first[j++] = f;
					f = "";
				}
				continue;
			}
			first[j++] = f;
			f = "";

		}
		for (int i = 0; i < input2.length(); i++) {
			if (input2.charAt(i) != ':') {
				s += input2.charAt(i);
				if (i == input2.length() - 1) {
					second[k++]=s;
					s = "";
				}
				continue;
			}
			second[k++] = s;
			s = "";

		}

		if (first.length < second.length)
			size = first.length;
		else
			size = second.length;

		for (int i = 0; i < size; i++) {
			int number1 = Integer.parseInt(first[i]);
			int number2 = Integer.parseInt(second[i]);

			if (number1 != number2) {
				return number1 - number2;
			}
		}
		return first.length - second.length;
	}
}

//output:
//	Enter the input 1 : 10:12:0
//	Enter the input2 : 10:12:2
//	10:12:2 is greater than 10:12:0

//Enter the input 1 : 10
//Enter the input2 : 9:11
//10 is greater than 9:11

//Enter the input 1 : 10:10:10
//Enter the input2 : 10:10:10
//10:10:10 is equal to 10:10:10

