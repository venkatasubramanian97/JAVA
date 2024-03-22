package Collection;

import java.util.HashSet;
import java.util.Set;

public class HAddingElement {

	public static void main(String[] args) {
		Set<String> hs = new HashSet<String>();

		hs.add("Geek");
		hs.add("For");
		hs.add("Geeks");

		System.out.println("HashSet elements : " + hs);
	}
}

//output:
//	HashSet elements : [Geek, For, Geeks]
