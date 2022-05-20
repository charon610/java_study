package daily1_10;

import java.util.Scanner;

public class IsoscelesTriangleLB {
	static void putChar(char c, int n) {
		while(n-- > 0)
			System.out.print(c);
	}
	
	static void putStar(int n) {
		putChar('*', n);
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("직각삼각형을 만듭니다.");
		System.out.print("몇 단으로 만들까요? : ");
		int n = stdIn.nextInt();
		
		for(int i = 1; i<=n; i++) {
			putStar(i);
		System.out.println();
		}
	}
}
