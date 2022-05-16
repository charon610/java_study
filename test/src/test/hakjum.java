package test;

import java.util.Scanner;

public class hakjum {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		double n = 0;
		do {
			System.out.print("점수를 입력하세요. : ");
			n = stdIn.nextInt();
		} while(n>100 || n<0);
		if(n>=90)
			System.out.println("A학점");
		else if(n>=80)
			System.out.println("B학점");
		else if(n>=70)
			System.out.println("C학점");
		else if(n>=60)
			System.out.println("D학점");
		else
			System.out.println("F학점");

		
		
	}

}
