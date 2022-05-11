package daily0511;

import java.util.Scanner;

public class ThreeDigits {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;

		do {
			System.out.print("세자리의 정숫값 : ");
			n = stdIn.nextInt();
		} while (n < 100 || n > 999);

		System.out.println("입력한 값은 : " + n + "입니다.");

	}

}
