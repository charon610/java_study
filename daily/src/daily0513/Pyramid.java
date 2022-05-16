package daily0513;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		System.out.println("피라미드를 만듭니다:");
		System.out.print("몇단으로 만들까요?:");
		int a = stdIn.nextInt();
		
		for (int i = 1; i<=a; i++) {
			for(int j = 1; j<=a-i; j++)
				System.out.print(' ');
			for(int j =1; j <=2*i-1; j++)
				System.out.print('*');
			System.out.println();
		}
	}

}
