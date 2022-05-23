package daily1_11;

import java.util.Scanner;

public class MinOf {
	static int minof(int a[]) {
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (min > a[i])
				min = a[i];
		}
		return min;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("사람 수 : ");
		int n = stdIn.nextInt();

		int h[] = new int[n];
		int w[] = new int[n];

		System.out.println(n + "명의 신장 입력");
		for (int i = 0; i < n; i++) {
			System.out.print((i + 1) + "번의 신장 : ");
			h[i] = stdIn.nextInt();
		}

		System.out.println(n + "명의 체중 입력");
		for (int i = 0; i < n; i++) {
			System.out.print((i + 1) + "번의 체중 : ");
			w[i] = stdIn.nextInt();
		}
		
		System.out.println("최저 신장은 : " + minof(h));
		System.out.print("최저 체중은 : " + minof(w));
	}
}
