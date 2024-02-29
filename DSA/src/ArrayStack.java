
public class ArrayStack<T> {
	int max_size = 30;
	@SuppressWarnings("unchecked")
	T array[] = (T[]) new Object[max_size];
	int top = -1;

	public void push(T val) {
		if (top != max_size - 1)
			array[++top] = val;
	}

	public T pop() {
		if (top == -1)
			return null;
		else
			return array[top--];
	}

	public T peek() {
		if (top != -1)
			return array[top];
		else
			return null;
	}
}