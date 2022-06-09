package daily2_2;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("연도를 입력하세요 : ");
		
		int a = input.nextInt();
		
		if(a % 4 == 0)
			System.out.println("짝수년, 윤년입니다.");
		else if(a % 2 == 1)
			System.out.println("홀수년입니다.");
		else
			System.out.println("짝수년 입니다.");
		
		
	}

}
