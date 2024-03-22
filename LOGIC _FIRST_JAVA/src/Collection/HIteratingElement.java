package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HIteratingElement {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();

		hs.add("Geek");
		hs.add("For");
		hs.add("Geeks");

		Iterator<String> i = hs.iterator();

		while (i.hasNext())
			System.out.print(i.next() + " ");
		System.out.println();
		for (String h : hs)
			System.out.print(h + " ");
	}
}
//output:
//	Geek For Geeks 
//	Geek For Geeks 
