//import java.util.LinkedHashSet;
//import java.util.Set;

public class StringDuplicate {

//	public static void main(String[] args) {
//		String input = "aabbccddeeff"; 
//		String result = removeDuplicates(input);
//		System.out.println("String after removing duplicates: " + result);
//	}
//
//	public static String removeDuplicates(String str) {
//		Set<Character> set = new LinkedHashSet<>();
//
//		for (char c : str.toCharArray()) {
//			set.add(c);
//		}
//
//		StringBuilder sb = new StringBuilder();
//		for (char c : set) {
//			sb.append(c);
//		}
//
//		return sb.toString();
//	}
	public static void main(String[] args) {
		String input = "vasudevan"; 
		System.out.println(input);
		int[] count = countAlphabets(input);
		printAlphabetCounts(count);
	}

	public static int[] countAlphabets(String str) {
		int[] count = new int[26];

		for (char c : str.toLowerCase().toCharArray()) {
			if (c >= 'a' && c <= 'z') {
				count[c-97]++;
			}
		}

		return count;
	}

	public static void printAlphabetCounts(int[] count) {
		System.out.println("Alphabet counts:");
		for (int i = 0; i < count.length; i++) {
			if (count[i] > 0) {
				System.out.println((char) (i + 'a') + ": " + count[i]);
			}
		}
	}

}
