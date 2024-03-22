package Collection;

import java.util.Stack;

public class StackExample {

	static void stack_push(Stack<Integer> stack) {
		for (int i = 0; i < 5; i++) {
			stack.push(i);
		}
	}

	static void stack_pop(Stack<Integer> stack) {
		System.out.println("Pop Operation:");

		for (int i = 0; i < 5; i++) {
			Integer y = stack.pop();
			System.out.println(y);
		}
	}

	static void stack_peek(Stack<Integer> stack) {
		Integer element = stack.peek();
		System.out.println("Element on stack top: " + element);
	}

	static void stack_search(Stack<Integer> stack, int element) {
		Integer pos = stack.search(element);

		if (pos == -1)
			System.out.println("Element not found");
		else
			System.out.println("Element is found at position: " + pos);
	}

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();

		stack_push(stack);
		stack_pop(stack);
		stack_push(stack);
		stack_peek(stack);
		stack_search(stack, 2);
		stack_search(stack, 6);
	}
}

//output:
//	Pop Operation:
//		4
//		3
//		2
//		1
//		0
//		Element on stack top: 4
//		Element is found at position: 3
//		Element not found

