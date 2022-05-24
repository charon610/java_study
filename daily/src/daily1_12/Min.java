package daily1_12;

import java.util.Scanner;

public class Min {
	static int min(int a, int b) {
		return (a < b) ? a : b;
	}

	static int min(int a, int b, int c) {
		int min = a;
		if (a > b)
			min = b;
		if (a > c)
			min = c;
		return min;
	}

	static int min(int a[]) {
		int min = a[0];
		for (int i = 1; i < a.length; i++) 
			if (a[i] < min)
				min = a[i];
			return min;
		}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("x값 : "); int x = stdIn.nextInt();
		System.out.print("y값 : "); int y = stdIn.nextInt();
		System.out.print("z값 : "); int z = stdIn.nextInt();
		
		System.out.print("배열의 요소 수 :");
		int n = stdIn.nextInt(); 
		int a[] = new int [n];

		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "]=");
			a[i] = stdIn.nextInt();
			
			System.out.print("x,y의 최솟값 : " + min(x,y));
			System.out.print("x,y,z의 최솟값 : " + min(x,y,z));
			System.out.print("a 배열의 최솟값 : " + min(a));
		}

		
	}
}
