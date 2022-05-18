package t0513;

import java.util.Scanner;

public class PrintArray {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("요소 입력 : ");
		int n = stdIn.nextInt();
		int a[] = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("a[" + i + "]=");
			a[i] = stdIn.nextInt();
		}
		
		System.out.println("a={");

	}

}
