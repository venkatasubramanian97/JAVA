package Collection;

import java.util.ArrayList;

public class AddTwoElement {

		public static void main(String[] args)
		{
			ArrayList<Integer> list = new ArrayList<>();
			list.add(1);
			list.add(2);
			list.add(4);
			System.out.println(list);
			// insert missing element 3
			list.add(2,3);
			System.out.println(list);
		}
	}


