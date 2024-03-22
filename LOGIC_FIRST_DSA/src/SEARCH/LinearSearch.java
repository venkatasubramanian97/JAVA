package SEARCH;

public class LinearSearch {
	public static int find(int array[], int val) {
		for (int i = 0; i < array.length; i++)
			if (array[i] == val)
				return i;
		return -1;
	}

	public static boolean contain(int array[], int val) {
		for (int i = 0; i < array.length; i++)
			if (array[i] == val)
				return true;
		return false;
	}

	public static int find(String str, int val) {
		for (int i = 0; i < str.length(); i++)
			if (str.charAt(i) == val)
				return i;
		return -1;
	}

	public static boolean contain(String str, int val) {
		for (int i = 0; i < str.length(); i++)
			if (str.charAt(i) == val)
				return true;
		return false;
	}

	public static int[] find(int array[][], int val) {
		for (int i = 0; i < array.length; i++)
			for (int j = 0; j < array[i].length; j++)
				if (array[i][j] == val)
					return new int[] {i,j};
		return new int[] {-1,-1};
	}

	public static boolean contain(int array[][], int val) {
		for (int i = 0; i < array.length; i++)
			for (int j = 0; j < array[i].length; j++)
				if (array[i][j] == val)
					return true;
		return false;
	}
}
