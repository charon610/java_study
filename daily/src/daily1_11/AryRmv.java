package daily1_11;

import java.util.Scanner;

public class AryRmv {

	static void aryRmvN(int a[], int idx) {
		if (idx >= 0 && idx < a.length) {
			for (int i = idx; i <= a.length - 1; i++)
				a[i] = a[i + 1];
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("배열의 요소 수 : ");
		int n = stdIn.nextInt();
		int a[] = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "]:");
			a[i] = stdIn.nextInt();
		}

		System.out.print("삭제를 시작할 인덱스 : ");
		int idx = stdIn.nextInt();

		aryRmvN(a, idx);
		for (int i = 0; i < n; i++)
			System.out.println("a[" + i + "]=" + a[i]);
	}
}
