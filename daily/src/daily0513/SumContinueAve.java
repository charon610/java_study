package daily0513;

import java.util.Scanner;

public class SumContinueAve {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("정수를 더합니다.");
		System.out.print("몇개를 더할까요? :");
		int n = stdIn.nextInt();
		int sum = 0;
		int count = 0;
		int i;
		for (i = 0; i < n; i++) {
			System.out.print("정숫값을 입력하세요 :");
			int a = stdIn.nextInt();
			if (a < 0) {
				System.out.println("음수는 더하지 않습니다.");
				continue;
			}
			sum += a;
			count++;
		}
		System.out.println("합계 : " + sum);
		if (i != 0)
			System.out.println("평균 : " + sum / count);
	}

}
