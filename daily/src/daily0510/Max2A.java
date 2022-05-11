package daily0510;

import java.util.Scanner;

public class Max2A {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("첫번째 실숫값을 입력하세요.");
		double a = stdIn.nextInt();

		System.out.println("두번째 실숫값을 입력하세요.");
		double b = stdIn.nextInt();

		double max;
		if (a > b)
			max = a;
		else
			max = b;

		System.out.println("큰 값은 "+ max + "입니다.");
	}

}
