import java.util.Iterator;

public class LinkedList<T> implements Iterable<T> {
	Node head;
	Node tail;

	class Node {
		T data;
		Node next;

		Node(T val) {
			data = val;
			next = null;
		}
	}

	LinkedList() {
		head = null;
		tail = null;
	}

	public void insertAtBeginning(T val) {
		Node newNode = new Node(val);
		newNode.next = head;
		if (head == null) {
			tail = newNode;
			head = newNode;
		} else
			head = newNode;
	}

	public int display() {
		int count = 0;
		Node temp = head;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

	public void insertAtPos(int pos, T val) {
		if (pos == 0) {
			insertAtBeginning(val);
			return;
		}
		Node newNode = new Node(val);
		Node temp = head;
		for (int i = 1; i < pos; i++) {
			temp = temp.next;
			if (temp != null && temp.next == null) {
				throw new IndexOutOfBoundsException("invalid pos" + pos);
			}
		}
		newNode.next = temp.next;
		temp.next = newNode;
	}

	public void insertAtEnd(T val) {
		Node newNode = new Node(val);
		tail.next = newNode;
		tail = newNode;
	}

	public void deleteAtfirst() {
		if (head == null) {
			throw new IndexOutOfBoundsException();
		}
		head = head.next;
		return;
	}

	public void deleteAtPos(int pos) {
		if (head == null) {
			throw new IndexOutOfBoundsException();
		}

		Node temp = head;
		Node prev = null;
		for (int i = 1; i <= pos; i++) {
			prev = temp;
			temp = temp.next;
			if (temp != null && temp.next == null)
				throw new IndexOutOfBoundsException();
		}
		prev.next = temp.next;
	}

	public void deleteAtEnd() {
		Node temp = head;
		Node prev = null;
		int pos = display();
		for (int i = 1; i < pos; i++) {
			prev = temp;
			temp = temp.next;
		}
		prev.next = null;
		tail = prev;
	}

	public void reverse() {
		Node prev = null;
		Node current = head;
		Node next = head.next;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
	}

	public Iterator<T> iterator() {
		return new Iterator<T>() {
			Node temp = head;

			public boolean hasNext() {
				return temp != null;
			}

			public T next() {
				T val = temp.data;
				temp = temp.next;
				return val;
			}
		};
	}
}
