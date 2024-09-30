
public class CharacterString {

	public static void main(String[] args) {
		String inputString = "helloworld";
		int[] charCount = countCharacters(inputString);

		for (int i = 0; i < charCount.length; i++) {
			if (charCount[i] > 0) {
				System.out.println((char) i + ": " + charCount[i]);
			}
		}
	}

	public static int[] countCharacters(String string) {
		int[] charCount = new int[256]; // Assuming ASCII characters

//		for (int i = 0; i < string.length(); i++) {
//			char ch = string.charAt(i);
//			charCount[ch]++;
//		}
		for (char ch : string.toCharArray()) {
			charCount[ch]++;
		}
		return charCount;
	}

}
