package daily2_1;

import java.util.Scanner;

public class test04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
							
		System.out.print("문자를 입력하세요 : ");
		char a1 = input.next().charAt(0);               // 문자 입력, charAt -> 문자열의 제일 앞글자만 반영
		System.out.println("문자로 출력 : " + a1 );     // 문자 그대로 출력
		int a2 = a1;                                    // char -> int로 변환
		System.out.println("숫자로 출력 : " + a2 );     // 아스키코드 출력
	}
}
