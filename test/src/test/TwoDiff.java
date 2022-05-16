package test;

import java.util.Scanner;

public class TwoDiff {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		System.out.print("첫번째 정숫값:");
		
		int a = stdIn.nextInt();
		
		System.out.print("두번째 정숫값:");
		
		int b = stdIn.nextInt();
		
		int diff = a-b;
		
		if(diff>=0)
		System.out.println("차이는 : "+diff);
		else
			System.out.println("차이는 : "+-diff);
	}

}
