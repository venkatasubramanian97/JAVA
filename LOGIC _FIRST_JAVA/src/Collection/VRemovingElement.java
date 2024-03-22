package Collection;

import java.util.Vector;

public class VRemovingElement {

	@SuppressWarnings("unchecked")
	public static  void main(String[] arg) {

		@SuppressWarnings("rawtypes")
		Vector v = new Vector();

		v.add(1);
		v.add(2);
		v.add("Geeks");
		v.add("forGeeks");
		v.add(4);

		v.remove(1);

		System.out.println("after removal: " + v);
	}
}
//output:
//	after removal: [1, Geeks, forGeeks, 4]
