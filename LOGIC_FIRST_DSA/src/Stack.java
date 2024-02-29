
public class Stack {

	public static void main(String[] args) {
		ArrayStack<Integer> stack = new ArrayStack<Integer>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		System.out.println("get the data : "+stack.pop());
		System.out.println("get the data : "+stack.pop());
		System.out.println("get the data : "+stack.pop());
		System.out.println("show the data last node : "+stack.peek());
		stack.push(40);
		stack.push(50);
		System.out.println("show the data last node : "+stack.peek());
		System.out.println("get the data : "+stack.pop());
		System.out.println("show the data last node : "+stack.peek());
	}

}
