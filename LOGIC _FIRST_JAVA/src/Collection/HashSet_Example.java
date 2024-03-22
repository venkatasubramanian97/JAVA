package Collection;

import java.util.*;

public class HashSet_Example {

	public static void main(String[] args) {

		HashSet<String> h = new HashSet<String>();

		h.add("India");
		h.add("Australia");
		h.add("South Africa");

		h.add("India");

		System.out.println(h);
		System.out.println("List contains India or not:" + h.contains("India"));

		h.remove("Australia");
		System.out.println("List after removing Australia:" + h);

		System.out.println("Iterating over list:");

		Iterator<String> i = h.iterator();

		while (i.hasNext())
			System.out.println(i.next());

		for (String s : h)
			System.out.print(s + " ");
	}
}

//output:
//	[South Africa, Australia, India]
//			List contains India or not:true
//			List after removing Australia:[South Africa, India]
//			Iterating over list:
//			South Africa
//			India
//			South Africa India 