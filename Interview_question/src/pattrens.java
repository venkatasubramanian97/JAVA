
public class pattrens {
	public static void main(String[] args) {
		int n = 5; // Number of rows
		pyramid(n);
		pyramid1(n);
		pyramid2(n);
	}

	public static void pyramid(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (2 * i - 1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void pyramid1(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}

			for (int k = 1; k <= i; k++) {
				System.out.print(k);
			}
			for (int l = i - 1; l >= 1; l--) {
				System.out.print(l);
			}
			System.out.println();
		}
	}

	public static void pyramid2(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}

			for (int k = i; k >= 1; k--) {
				System.out.print(k);
			}
			for (int l = 2; l <= i; l++) {
				System.out.print(l);
			}
			System.out.println();
		}
	}
}
