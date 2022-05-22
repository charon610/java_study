package daily1_10;

import java.util.Scanner;

class Rotate {
	
	static void printbits(int x) {
		for (int i = 31; i >= 0; i--)
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
	}
	
	static int rRotate(int x, int n) {
		if(n < 0)
			return lRotate(x, -n);
		n %= 32;
		return (n == 0 ? x : (x >>> n) | (x << (32 - n)));
	}
	
	static int lRotate(int x, int n) {
		if(n < 0)
			return rRotate(x, -n);
		n %= 32;
		return (n == 0 ? x : (x << n) | (x >>> (32 - n)));
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수를 n비트 회전합니다.");
		System.out.print("x : "); int x = stdIn.nextInt();
		System.out.print("n : "); int n = stdIn.nextInt();
		System.out.print("회전 전 = "); printbits(x);
		
		System.out.print("\n 오른쪽 회전 = "); printbits(rRotate(x, n));
		System.out.print("\n 왼쪽 회전 = "); printbits(lRotate(x, n));
		
	
	}

}
