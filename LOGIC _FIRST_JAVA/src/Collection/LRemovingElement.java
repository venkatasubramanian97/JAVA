package Collection;

import java.util.LinkedList;
import java.util.List;

public class LRemovingElement {

	public static void main(String args[]) {
		List<String> ll = new LinkedList<>();

		ll.add("Geeks");
		ll.add("Geeks");
		ll.add(1, "For");

		System.out.println("Initial LinkedList " + ll);

		ll.remove(1);

		System.out.println("After the Index Removal " + ll);

		ll.remove("Geeks");

		System.out.println("After the Object Removal " + ll);
	}
}

//output:
//	Initial LinkedList [Geeks, For, Geeks]
//			After the Index Removal [Geeks, Geeks]
//			After the Object Removal [Geeks]
