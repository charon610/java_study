package daily2_2;

import java.util.Scanner;

public class Test05 {

	static void add (int x, int y) {
		System.out.println("두 수의 합 : " + (x + y));
	}
	
	static void sub (int x, int y) {
		System.out.println("두 수의 차 : " + (x - y));
	}
	
	static void mul (int x, int y) {
		System.out.println("두 수의 곱 : " + (x * y));
	}
	
	static void div (int x, int y) {
		System.out.println("두 수의 나누기 : " + (x / y));
	}
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 정수 입력 : ");
		int num1 = scan.nextInt();
		
		System.out.print("두번째 정수 입력 : ");
		int num2 = scan.nextInt();
		
		add(num1, num2);
		sub(num1, num2);
		mul(num1, num2);
		div(num1, num2);
	}
}
