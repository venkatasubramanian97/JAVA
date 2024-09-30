
public class Vowels {

	public static void main(String[] args) {
		String input = "Hello, World!";

		if (containsVowel(input)) {
			System.out.println("The string contains a vowel.");
		} else {
			System.out.println("The string does not contain a vowel.");
		}
	}

	public static  boolean containsVowel(String str) {
		str = str.toLowerCase();

		String vowels = "aeiou";

		for (int i = 0; i < str.length(); i++) {
			if (vowels.indexOf(str.charAt(i)) != -1) {
				return true;
			}
		}

		return false;

//		String input = "Hello, World!";
//
//		input = input.toLowerCase();
//
//		int vowelCount = 0;
//		int consonantCount = 0;
//
//		String vowels = "aeiou";
//
//		for (int i = 0; i < input.length(); i++) {
//			char c = input.charAt(i);
//
//			if (Character.isLetter(c)) {
//				if (vowels.indexOf(c) != -1) {
//					vowelCount++;
//				} else {
//					consonantCount++;
//				}
//			}
//		}
//
//		System.out.println("Number of vowels: " + vowelCount);
//		System.out.println("Number of consonants: " + consonantCount);

	}

}
