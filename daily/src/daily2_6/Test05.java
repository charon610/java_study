package daily2_6;

import java.util.Scanner;

public class Test05 {
	static void primeN(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				System.out.print(n + " : 소수가 아님");
				break;
			}
		}
		System.out.print(n + " : 소수");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=0;
		do {
		System.out.print("2이상의 정수를 입력하세요 : ");
		n = sc.nextInt();
		} while(n<=1);

		primeN(n);
	}
}
