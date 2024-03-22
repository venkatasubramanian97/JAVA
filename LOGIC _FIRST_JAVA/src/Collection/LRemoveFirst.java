package Collection;

import java.util.LinkedList;
import java.util.List;

public class LRemoveFirst {

	public static void main(String args[]) {

		List<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println("LinkedList:" + list);
		System.out.println("The remove first element is: " + list.removeFirst());
		System.out.println("Final LinkedList:" + list);
	}
}
//output:
//	LinkedList:[10, 20, 30]
//			The remove first element is: 10
//			Final LinkedList:[20, 30]
