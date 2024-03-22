package Collection;

import java.util.LinkedList;
import java.util.List;

public class LRemoveLast {

	public static void main(String args[]) {

		List<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println("LinkedList:" + list);
		System.out.println("The last element is removed: " + list.removeLast());
		System.out.println("Final LinkedList:" + list);
		System.out.println("The last element is removed: " + list.removeLast());
		System.out.println("Final LinkedList:" + list);
	}
}

//output:
//	LinkedList:[10, 20, 30]
//			The last element is removed: 30
//			Final LinkedList:[10, 20]
//			The last element is removed: 20
//			Final LinkedList:[10]
