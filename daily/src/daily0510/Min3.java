package daily0510;

import java.util.Scanner;

public class Min3 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("첫번째 정숫값 : ");
		int a = stdIn.nextInt();
		
		System.out.println("두번째 정숫값 : ");
		int b = stdIn.nextInt();
		
		System.out.println("세번째 정숫값 : ");
		int c = stdIn.nextInt();
		
		int min = a;
		
		if(b<min)
			min = b;
		if(c<min)
			min = c;
			System.out.println("최솟값은 : " + min+ "입니다.");
		
		
	}

}
