package daily0510;

import java.util.Scanner;

public class Diff2A {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("첫번째 정숫값:");
		
		int a = stdIn.nextInt();
		
		System.out.println("두번째 정숫값:");
		
		int b = stdIn.nextInt();
		
		if(a>b)
			System.out.println(a-b);
		else
			System.out.println(b-a);
		
	}

}
