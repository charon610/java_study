package daily1_11;

import java.util.Scanner;

public class Sumof1 {
	
	static int sumof (int a []) {
		int sum = 0;
		for(int i = 0; i<a.length; i++)

			sum += a[i];
		
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("배열의 요소 수 : ");
		int n = stdIn.nextInt();
		int a [] = new int [n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "]=");
			a[i] = stdIn.nextInt();
		
		}
		
			System.out.println("배열의 합 : " + sumof(a));

		
	}

}
