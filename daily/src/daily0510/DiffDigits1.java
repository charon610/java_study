package daily0510;

import java.util.Scanner;

public class DiffDigits1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("첫번째 정수 : ");
		int a = stdIn.nextInt();
		
		System.out.println("두번째 정수 : ");
		int b = stdIn.nextInt();
		
		int result;
		
		if(a>b)
			result = a-b;
		else
			result = b-a;
		
		if(result<=10)
			System.out.println("두 값의 차는 10이하입니다.");
		else
			System.out.println("두 값의 차는 11이상입니다.");
	}

}
