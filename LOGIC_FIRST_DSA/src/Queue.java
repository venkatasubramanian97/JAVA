//
//public class Queue<T> {
//	int max_size = 30;
//	@SuppressWarnings("unchecked")
//	T array[] = (T[]) new Object[max_size];
//	int front, rear;
//
//	Queue() {
//		front = -1;
//		rear = -1;
//	}
//
//	public void enqueue(T val) {
//		if (rear == max_size - 1)
//			throw new IndexOutOfBoundsException();
//		if (front == -1)
//			++front;
//		array[++rear] = val;
//	}
//
//	public T dequeue() {
//		if (front == -1 || rear < front)
//			throw new IndexOutOfBoundsException();
//		return array[front++];
//	}
//
//	public T peek() {
//		return array[rear];
//	}
//}

public class Queue<T> {
	Node front, rear;

	class Node {
		T data;
		Node next;

		Node(T val) {
			data = val;
			next = null;
		}
	}

	Queue() {
		front = null;
		rear = null;
	}

	public void enqueue(T val) {
		Node newNode = new Node(val);
		if (front == null)
			front = newNode;
		else
			front.next = newNode;
		rear = newNode;
	}

	public T dequeue() {
		if (front==null)
			throw new IndexOutOfBoundsException();
		Node temp = front;
		front = front.next;
		if(front==null)
			rear=null;
		return temp.data;
	}
	public T peek() {
		return front.data;
	}
}