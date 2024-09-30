
public class Reverse_string {
	public static void main(String[] args) {
		String input = "Hello, World!";
		String reversed = reverseString(input);
		System.out.println("Original String: " + input);
		System.out.println("Reversed String: " + reversed);
	}

//	public static String reverseString(String str) {
//		StringBuilder sb = new StringBuilder(str);
//		return sb.reverse().toString();
		
//	public static String reverseString(String str) {
//	char[] chars = str.toCharArray();
//	StringBuilder sb = new StringBuilder();
//	for (int i = chars.length - 1; i >= 0; i--) {
//		sb.append(chars[i]);
//	}
//	
//	return sb.toString();
	
	public static String reverseString(String str) {
	String reverse="";
	for(int i=str.length()-1;i>=0;i--) {
		reverse+=str.charAt(i);
	}
	return reverse;
	
	}
}

//output:
//	Original String: Hello, World!
//	Reversed String: !dlroW ,olleH
	
