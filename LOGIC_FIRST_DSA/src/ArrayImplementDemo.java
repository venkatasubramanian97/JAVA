
import java.util.*;

class DynamicArray<T>implements Iterable<T>{
	private T arr[];
	private int size;
	private int capacity;
	private static final int initialcapacity = 2;

	@SuppressWarnings("unchecked")
	DynamicArray() {
		size = 0;
		arr = (T[])new Object[initialcapacity];
		capacity = initialcapacity;
	}

	public void add(T val) {
		if (size == capacity)
			expandArray();
		arr[size++] = val;
	}

	private void expandArray() {
		capacity *= 2;
		arr = java.util.Arrays.copyOf(arr, capacity);
	}

//	public void Display() {
//		System.out.print("\nEnter in the list : ");
//		for (int i = 0; i < size; i++) {
//			System.out.print(arr[i] + " ");
//		}
//	}

	public void insertAtpos(int pos, T val) {
		if (size == capacity)
			expandArray();
		for (int i = size - 1; i >= pos; i--)
			arr[i + 1] = arr[i];
		arr[pos] = val;
		size++;

	}

	public void deleteAtpos(int pos) {
		for (int i = pos + 1; i < size; i++)
			arr[i - 1] = arr[i];
		size--;
		if (capacity > initialcapacity && capacity > 3 * size)
			shrinkArray();
	}

	private void shrinkArray() {
		capacity /= 2;
		arr = java.util.Arrays.copyOf(arr, capacity);
	}

	@Override
	public Iterator<T> iterator() {
		return new Iterator<T>() {
			int index=0;
			public T next() {
				return arr[index++];
			}
			public boolean hasNext() {
				return index<size;
			}
		};
	}
}

public class ArrayImplementDemo {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int val, pos;
		DynamicArray<Integer> list = new DynamicArray<Integer>();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("\n----------List Menu------------\n");
			System.out.println("1.Insert at End\n");
			System.out.println("2.Display the list\n");
			System.out.println("3.Insert at specified position\n");
			System.out.println("4.Delete from specified position\n");
			System.out.println("5.Exit\n");
			System.out.println("------------------------\n");
			System.out.print("Enter your choice : ");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.print("\nEnter the data : ");
				val = scanner.nextInt();
				list.add(val);
				break;
			case 2:
//				list.Display();
				for(int a:list) {
					System.out.print(a+" ");
				}
				break;
			case 3:
				System.out.print("Enter the position (starts at 0): ");
				pos = scanner.nextInt();
				if (pos < 0) {
					System.out.print("Invalid position");
					break;
				}
				System.out.print("Entert the data : ");
				val = scanner.nextInt();
				list.insertAtpos(pos, val);
				break;
			case 4:
				System.out.print("Enter the position (starts at 0): ");
				pos = scanner.nextInt();
				if (pos < 0) {
					System.out.print("Invalid position");
					break;
				}
				list.deleteAtpos(pos);
				break;
			case 5:
				System.exit(0);
			default:
				System.out.println("Invalid choice");
			}
		}
		}
	}
/*delete at end;
 * delete from beginning;
 * insert at beginning;
 * get(index);
 * update(index,val);
 * search(val);
 * clear 
 * contains(val)true or false;
 */
