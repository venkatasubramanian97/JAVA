package SEARCH;

import java.util.Arrays;

public class SeachDemo {

	public static void main(String[] args) {
		int array1[]= {100,95,93,84,80,76,70,8,1};
		System.out.println("Index of the value : "+BinarySearch.search(array1,100));
		System.out.println("-------------------------------------");
		
		int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println("Index of the value : " + LinearSearch.find(array, 8));
		System.out.println("true or false : " + LinearSearch.contain(array, 0));
		System.out.println("\n");
		
		String name = "vasudevan";
		System.out.println("Index of the value : " + LinearSearch.find(name, 'v'));
		System.out.println("true or false : " + LinearSearch.contain(name, 'd'));
		System.out.println("\n");
		
		int arr[][]= {{1,2,3,4,5},{6,7,8,9,0},{12,13}};
		int[] result=LinearSearch.find(arr, 8);
		System.out.println("Index of the value : " + Arrays.toString(result));
		System.out.println("true or false : " + LinearSearch.contain(arr, 0));
	}

}
