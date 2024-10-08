import java.util.Scanner;

public class Palindromes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String input = scan.nextLine();
        System.out.println(removePalindromes(input));
        scan.close();
    }

    public static String removePalindromes(String str) {
    	String word="";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z' || str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                word+=str.charAt(i);
            } else {
                if (!isPalindrome(word)) {
                    result.append(word).append(" ");
                }
                word=""; // Reset the word
            }
        }

        return result.toString().trim();
    }

    public static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}

//output:
//	Enter a sentence:
//		He did a good deed
//		He good

