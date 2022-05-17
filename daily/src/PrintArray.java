import java.util.Scanner;

public class PrintArray {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("요소 수:");
		int n = stdIn.nextInt();
		int a[] = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "]= ");
			a[i] = stdIn.nextInt();

		}
		System.out.println("a = {");
		if (n >= 2)
			for (int i = 0; i < n - 1; i++)
				System.out.println(a[i] + ", ");
		if (n >= 1)
			System.out.println(a[n - 1]);
		System.out.println("}");
	}
}
