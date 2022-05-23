package daily1_11;

import java.util.Scanner;

public class SetBit {

	static void printbits(int x) {
		for (int i = 31; i >= 0; i--)
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
	}

	static int set(int x, int pos) {
		return x | (1 << pos);
	}

	static int reset(int x, int pos) {
		return x & ~(1 << pos);
	}

	static int inverse(int x, int pos) {
		return x ^ (1 << pos);
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("정수x의 pos번째 비트를 변경합니다.");
		System.out.print("x:");
		int x = stdIn.nextInt();
		System.out.print("pos:");
		int pos = stdIn.nextInt();

		System.out.print("x                   = ");
		printbits(x);
		System.out.print("\nset(x, pos)       = ");
		printbits(set(x, pos));
		System.out.print("\nreset(x, pos)     = ");
		printbits(reset(x, pos));
		System.out.print("\ninverse(x, pos)   = ");
		printbits(inverse(x, pos));
		System.out.println();
	}

}
