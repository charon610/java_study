package daily0510;

import java.util.Scanner;

public class MinMaxEq {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("첫번째 정숫값 : ");
		int a = stdIn.nextInt();

		System.out.println("두번째 정숫값 : ");
		int b = stdIn.nextInt();

		if (a == b)
			System.out.println("두 값이 같습니다.");

		else if (a > b) {
			System.out.println("큰 값은 : " + a + "입니다.");
			System.out.println("작은 값은 : " + b + "입니다.");
		} else {
			System.out.println("큰 값은 : " + b + "입니다.");
			System.out.println("작은 값은 : " + a + "입니다.");
		}

	}

}
