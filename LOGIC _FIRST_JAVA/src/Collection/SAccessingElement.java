package Collection;

import java.util.Stack;

public class SAccessingElement {

	public static void main(String args[]) {
		Stack<String> stack = new Stack<String>();

		stack.push("Welcome");
		stack.push("To");
		stack.push("Geeks");
		stack.push("For");
		stack.push("Geeks");

		System.out.println("Initial Stack: " + stack);

		System.out.println("The element at the top of the" + " stack is: " + stack.peek());

		System.out.println("Final Stack: " + stack);
	}
}

//output:
//	Initial Stack: [Welcome, To, Geeks, For, Geeks]
//			The element at the top of the stack is: Geeks
//			Final Stack: [Welcome, To, Geeks, For, Geeks]
