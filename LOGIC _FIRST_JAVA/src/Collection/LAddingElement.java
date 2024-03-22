package Collection;

import java.util.LinkedList;
import java.util.List;

public class LAddingElement {

	public static void main(String args[]) {
		List<String> ll = new LinkedList<>();

		ll.add("Geeks");
		ll.add("Geeks");
		ll.add(1, "For");
		ll.addFirst("Geeks");

		System.out.println(ll);
	}
}

//output:
//	[Geeks, For, Geeks]
