package daily0511;

import java.util.Scanner;

public class CountDownPre {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("카운트다운");
		int x;

		do {
			System.out.println("양의 정숫값 : ");
			x = stdIn.nextInt();
		} while (x <= 0);

		while (x >= 0)
			System.out.println(--x);
		System.out.println("x값" + x + "이 되었습니다.");

	}

}
