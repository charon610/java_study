package daily0513;

import java.util.Scanner;

public class SumBreak2Ave {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("정수를 더합니다.");
		System.out.print("몇개를 더할까요? :");
		int n = stdIn.nextInt();
		int sum = 0;
		int i;
		for (i = 0; i < n; i++) {
			System.out.print("정숫값을 입력하세요 :");
			int a = stdIn.nextInt();
			if (sum + a > 1000) {
				System.out.println("합계가 1,000을 넘었습니다.");
				System.out.println("마지막 값은 무시합니다.");
				break;
			}
			sum += a;
		}
		System.out.println("합계 : " + sum);
		if (i != 0)
			System.out.println("평균 : " + sum / n);
	}
}