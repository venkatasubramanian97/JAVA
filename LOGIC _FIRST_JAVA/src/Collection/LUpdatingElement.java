package Collection;

import java.util.LinkedList;
import java.util.List;

public class LUpdatingElement {

	public static void main(String args[]) {
		List<String> ll = new LinkedList<>();

		ll.add("Geeks");
		ll.add("Geeks");
		ll.add(1, "Geeks");

		System.out.println("Initial LinkedList " + ll);

		ll.set(1, "For");

		System.out.println("Updated LinkedList " + ll);
	}
}

//output:
//	Initial LinkedList [Geeks, Geeks, Geeks]
//			Updated LinkedList [Geeks, For, Geeks]
