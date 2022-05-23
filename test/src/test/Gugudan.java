package test;

import java.io.IOException;
import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.print("몇단의 구구단을 출력할까요? :");
			int dan = scan.nextInt();
			if (!(dan == 0 || dan == 1)) {
				System.out.println(dan + "단 출력");
				for (int j = 1; j <= 9; j++) {
					System.out.println(dan + "*" + j + "=" + dan * j);
				}

			} else {
				System.out.println("프로그램 종료");
				break;
			}
		}
	}

}
