import java.util.Stack;

public class WordReverseString {

//	public static String reverseEachWord(String str) {
//		String[] words = str.split(" ");
//		StringBuilder reversedString = new StringBuilder();
//
//		for (String word : words) {
//			StringBuilder reverseWord = new StringBuilder(word);
//			reversedString.append(reverseWord.reverse());
//			reversedString.append(" ");
//		}
//
//		return reversedString.toString().trim();
//	}
//
//	public static void main(String[] args) {
//		String input = "Hello World";
//		String result = reverseEachWord(input);
//		System.out.println(result);
//	}

	public static String reverseEachWord(String str) {
		Stack<Character> stack = new Stack<>();
		StringBuilder result = new StringBuilder();

		for (char ch : str.toCharArray()) {
			if (ch != ' ') {
				stack.push(ch);
			} else {
				while (!stack.isEmpty()) {
					result.append(stack.pop());
				}
				result.append(' ');
			}
		}

		while (!stack.isEmpty()) {
			result.append(stack.pop());
		}

		return result.toString();
	}

	public static void main(String[] args) {
		String input = "Hello World";
		String result = reverseEachWord(input);
		System.out.println(result);
	}

}
