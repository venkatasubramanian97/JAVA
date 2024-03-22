package Collection;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TRemovingElement {

	public static void main(String[] args) {
		NavigableSet<String> ts = new TreeSet<>();

		ts.add("Geek");
		ts.add("For");
		ts.add("Geeks");
		ts.add("A");
		ts.add("B");
		ts.add("Z");

		System.out.println("Initial TreeSet " + ts);

		ts.remove("B");

		System.out.println("After removing element " + ts);

		ts.pollFirst();

		System.out.println("After removing first " + ts);

		ts.pollLast();

		System.out.println("After removing last " + ts);
	}
}

//output:
//Initial TreeSet [A, B, For, Geek, Geeks, Z]
//After removing element [A, For, Geek, Geeks, Z]
//After removing first [For, Geek, Geeks, Z]
//After removing last [For, Geek, Geeks]
