package Collection;

import java.util.HashSet;

public class HRemovingElement {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();

		hs.add("Geek");
		hs.add("For");
		hs.add("Geeks");
		hs.add("A");
		hs.add("B");
		hs.add("Z");

		System.out.println("Initial HashSet " + hs);

		hs.remove("B");

		System.out.println("After removing element " + hs);

		System.out.println("Element AC exists in the Set : " + hs.remove("A"));
		System.out.println("Element AC exists in the Set : " + hs);
	}
}

//output:
//	Initial HashSet [A, B, Geek, For, Geeks, Z]
//			After removing element [A, Geek, For, Geeks, Z]
//			Element AC exists in the Set : true
//			Element AC exists in the Set : [Geek, For, Geeks, Z]
