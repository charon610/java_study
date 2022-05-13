package daily0513;

import java.util.Scanner;

public class IsoscelesTriangelLB {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		System.out.print("정수를 입력하세요:");
		int a = stdIn.nextInt();
		for(int i=1; i<=a; i++) {
			for(int j=1; j<=i; j++)
			System.out.print('*');
		System.out.println();
		}
	}

}
