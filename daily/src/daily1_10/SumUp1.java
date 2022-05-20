package daily1_10;

import java.util.Scanner;

public class SumUp1 {
	static int sumup(int n) {
		int sum = 0;
		for(int i = 1; i<=n; i++) 
			sum += i;
		return sum;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("1부터 입력한 정수값까지의 합");
		int n;
		
		do {
			System.out.print("0보다 큰 정숫값 : ");
			n = stdIn.nextInt();
		} while(n<=0);
		
		System.out.println("1부터 " + n + " 까지의 합은 : " + sumup(n));
		
		
	}

}
