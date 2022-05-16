package t0513;

import java.util.Scanner;

public class Pyramid_t {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("단 수는? : ");
		int n = stdIn.nextInt();
		
		for(int i = 1; i<=n; i++) {
			for(int j = 1; j<=n-i; j++)
				System.out.print(" ");
			for(int j = 1; j<=2*i-1; j++)
				System.out.print('*');
			System.out.println();
		}

	}

}
