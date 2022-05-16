package t0513;

import java.util.Scanner;

public class Square1_t {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("정숫값 : ");
		int n = stdIn.nextInt();
		
		for( int i=1; i<=n; i++) {
			System.out.println(i*i);
		}
		
	}
}