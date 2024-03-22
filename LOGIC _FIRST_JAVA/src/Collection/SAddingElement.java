package Collection;

import java.util.Stack;

public class SAddingElement {

	public static void main(String[] args) {
		Stack<String> stack1 = new Stack<>();

		Stack<String> stack2 = new Stack<String>();

		stack1.push("4");
		stack1.push("All");
		stack1.push("Geeks");

		stack2.push("Geeks");
		stack2.push("For");
		stack2.push("Geeks");

		System.out.println(stack1);
		System.out.println(stack2);
	}
}

//output:
//[4, All, Geeks]
//[Geeks, For, Geeks]
