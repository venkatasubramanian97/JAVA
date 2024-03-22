package Collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String args[]) {
		List<String> ll = new LinkedList<String>();

		ll.add("A");
		ll.add("B");
		ll.addLast("C");
		ll.addFirst("D");
		ll.add(2, "E");

		System.out.println(ll);

		ll.remove("B");
		ll.remove(3);
		ll.removeFirst();
		ll.removeLast();

		System.out.println(ll);
	}
}

//output:
//	[D, A, E, B, C]
//			[A]
