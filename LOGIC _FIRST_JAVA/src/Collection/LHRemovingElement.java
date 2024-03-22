package Collection;

import java.util.LinkedHashSet;

public class LHRemovingElement {

	public static void main(String[] args) {

		LinkedHashSet<String> hs = new LinkedHashSet<String>();

		hs.add("Geek");
		hs.add("For");
		hs.add("Geeks");
		hs.add("A");
		hs.add("B");
		hs.add("Z");

		System.out.println("Initial HashSet " + hs);

		hs.remove("B");

		System.out.println("After removing element " + hs);

		System.out.println(hs.remove("AC"));
	}
}

//output:
//	Initial HashSet [Geek, For, Geeks, A, B, Z]
//			After removing element [Geek, For, Geeks, A, Z]
//			false
