package Collection;

import java.util.Stack;

public class SRemovingElement {

	public static void main(String args[]) {
		Stack<Integer> stack = new Stack<Integer>();

		stack.push(10);
		stack.push(15);
		stack.push(30);
		stack.push(20);
		stack.push(5);

		System.out.println("Initial Stack: " + stack);

		System.out.println("Popped element: " + stack.pop());
		System.out.println("Popped element: " + stack.pop());

		System.out.println("Stack after pop operation " + stack);
	

		Stack<Integer> stack1 = new Stack<>();

		stack1.push(1);
		stack1.push(2);
		stack1.push(3);
		stack1.push(4);
		System.out.println();

		while(!stack1.isEmpty()) {
			System.out.println(stack1.pop());
		}
		stack1.push(1);
		stack1.push(2);
		stack1.push(3);
		stack1.push(4);
		System.out.println();
		
		int pos=stack1.search(3);
		if (pos == -1)
			System.out.println("Element not found");
		else
			System.out.println("Element is found at position: " + pos);
	}
}


//output:
//	Initial Stack: [10, 15, 30, 20, 5]
//			Popped element: 5
//			Popped element: 20
//			Stack after pop operation [10, 15, 30]
