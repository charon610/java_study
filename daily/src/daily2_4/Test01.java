package daily2_4;

import java.util.Random;

public class Test01 {
	public static void main(String[] args) {
		int[] a = new int[10]; // 배열 크기 10으로 지정한다.
		Random rd = new Random();

		for (int i = 0; i < a.length; i++) {
			a[i] = rd.nextInt(100) + 1; // 랜덤한 수 10개 입력
		}

		System.out.println("10개의 랜덤한 수");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		int max = a[0];
		int min = a[0];
		int med = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] > max)
				max = a[i];
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min)
				min = a[i];
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}
		}
		med = (a[4] + a[5]) / 2;

		System.out.println();
		System.out.println("최댓값은 : " + max);
		System.out.println("최솟값은 : " + min);
		System.out.println("중간값은 : " + med);

	}
}