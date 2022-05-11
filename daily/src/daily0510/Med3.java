package daily0510;

import java.util.Scanner;

public class Med3 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("첫번째 정숫값 : ");
		int a = stdIn.nextInt();

		System.out.println("두번째 정숫값 : ");
		int b = stdIn.nextInt();

		System.out.println("세번째 정숫값 : ");
		int c = stdIn.nextInt();
		int med;

		if (a >= b)
			if (b >= c)
				med = b;
			else if (a <= c)
				med = a;
			else
				med = c;
		else if (a > c)
			med = a;
		else if (b > c)
			med = c;
		else
			med = b;

		System.out.println("중앙값은 :" + med + "입니다.");

	}
}
