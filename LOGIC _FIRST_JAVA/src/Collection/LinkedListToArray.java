package Collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListToArray {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();
		list.add(123);
		list.add(12);
		list.add(11);
		list.add(1134);
		System.out.println("LinkedList: " + list);
		Object[] a = list.toArray();
		System.out.print("After converted LinkedList to Array: ");
		for (Object element : a)
			System.out.print(element + " ");
	}
}

//output:
//	LinkedList: [123, 12, 11, 1134]
//			After converted LinkedList to Array: 123 12 11 1134 