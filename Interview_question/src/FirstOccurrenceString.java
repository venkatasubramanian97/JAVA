
public class FirstOccurrenceString {

	public static void main(String[] args) {
		String str = "Hello, world!";
		char ch = 'o';

		int index = str.indexOf(ch);
		if (index != -1) {
			System.out.println("The first occurrence of character '" + ch + "' is at index: " + index);
		} else {
			System.out.println("Character '" + ch + "' is not found in the string.");
		}

		String str1 = "Hello, world!";
		String substr = "world";

		int index1 = str1.indexOf(substr);
		if (index1 != -1) {
			System.out.println("The first occurrence of substring \"" + substr + "\" is at index: " + index1);
		} else {
			System.out.println("Substring \"" + substr + "\" is not found in the string.");
		}

		String str2 = "Hello,world!";
		char ch1 = 'o';
		int fromIndex = 5;

		int index2 = str2.indexOf(ch1, fromIndex);
		if (index2 != -1) {
			System.out.println("The first occurrence of character '" + ch1 + "' from index " + fromIndex
					+ " is at index: " + index2);
		} else {
			System.out.println("Character '" + ch1 + "' is not found in the string after index " + fromIndex + ".");
		}

		String str3 = "Hello, world! Welcome to the world of Java.";
		String substr1 = "world";
		int fromIndex1 = 10;

		int index3 = str3.indexOf(substr1, fromIndex1);
		if (index3 != -1) {
			System.out.println("The first occurrence of substring \"" + substr1 + "\" from index " + fromIndex1
					+ " is at index: " + index3);
		} else {
			System.out.println(
					"Substring \"" + substr1 + "\" is not found in the string after index " + fromIndex1 + ".");
		}

	}

}
