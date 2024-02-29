import java.util.Scanner;
public class ForeachDemo {

	public static void main(String[] args) {
		int arr[]= new int[5];
		int sum=0;
		@SuppressWarnings("resource")
		Scanner Scan =new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			arr[i]=Scan.nextInt();
			System.out.println(arr[i]);
		}
		for(int j:arr) {
			sum+=j;
		}
		System.out.print(sum);
		}
	
	}

