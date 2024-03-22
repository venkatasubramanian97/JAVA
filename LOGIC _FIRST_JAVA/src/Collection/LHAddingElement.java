package Collection;

import java.util.LinkedHashSet;

public class LHAddingElement {

	public static void main(String[] args) {

		LinkedHashSet<String> hs = new LinkedHashSet<String>();

		hs.add("Geek");
		hs.add("For");
		hs.add("Geeks");

		System.out.println("LinkedHashSet : " + hs);
	}
}

//output:
//	LinkedHashSet : [Geek, For, Geeks]
