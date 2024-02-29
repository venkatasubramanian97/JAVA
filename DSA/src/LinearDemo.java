import java.util.Arrays;

public class LinearDemo {

	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println("Index of the value : " + LinearSearch.find(array, 8));
		System.out.println("true or false : " + LinearSearch.contain(array, 0));
		String name = "vasudevan";
		System.out.println("Index of the value : " + LinearSearch.find(name, 'v'));
		System.out.println("true or false : " + LinearSearch.contain(name, 'd'));
		int arr[][]= {{1,2,3,4,5},{6,7,8,9,0},{12,13}};
		int[] result=LinearSearch.find(arr, 8);
		System.out.println("Index of the value : " + Arrays.toString(result));
		System.out.println("true or false : " + LinearSearch.contain(arr, 0));			
	}

}
