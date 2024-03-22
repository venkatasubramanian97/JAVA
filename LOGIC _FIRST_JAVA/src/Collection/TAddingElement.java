package Collection;

import java.util.Set;
import java.util.TreeSet;

public class TAddingElement {

	public static void main(String[] args) {
		Set<String> ts = new TreeSet<>();

		ts.add("Geek");
		ts.add("For");
		ts.add("Geeks");

		System.out.println(ts);
	}
}

//output:
//	[For, Geek, Geeks]
