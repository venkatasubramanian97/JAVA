package Collection;

import java.util.LinkedHashSet;

public class LinkedHasshSetElement {

	public static void main(String[] args) {

		LinkedHashSet<String> linkedset = new LinkedHashSet<String>();

		linkedset.add("A");
		linkedset.add("B");
		linkedset.add("C");
		linkedset.add("D");

		linkedset.add("A");
		linkedset.add("E");

		System.out.println("Size of LinkedHashSet = " + linkedset.size());

		System.out.println("Original LinkedHashSet:" + linkedset);

		System.out.println("Removing D from LinkedHashSet: " + linkedset.remove("D"));

		System.out.println("Trying to Remove Z which is not " + "present: " + linkedset.remove("Z"));

		System.out.println("Checking if A is present=" + linkedset.contains("A"));

		System.out.println("Updated LinkedHashSet: " + linkedset);
	}
}
//output:
//	Size of LinkedHashSet = 5
//	Original LinkedHashSet:[A, B, C, D, E]
//	Removing D from LinkedHashSet: true
//	Trying to Remove Z which is not present: false
//	Checking if A is present=true
//	Updated LinkedHashSet: [A, B, C, E]
