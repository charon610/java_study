package daily2_2;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
	String input = "";	//입력받은 문자열을 저장할 input 선언
	String output = "";	//최종적으로 출력할 문자열을 저장하는 output 선언
	char tmp;
	
	Scanner scan = new Scanner(System.in);
	
	System.out.print("문자열을 입력하세요 : ");
	input = scan.nextLine();	//입력받은 문자열을 input에 저장
	
	for(int i = 0 ; i < input.length() ; i++) {	//문자열을 검사하기 위해서 input의 길이만큼 반복문 실행(한글자씩 tmp에 옮겨서 검사)
		tmp = input.charAt(i);	//문자열을 한글자씩 tmp에 넣는다.
		if( (65 <= tmp) && (tmp <= 90) ) {	//문자가 65 <= tmp <= 90인 경우 (대문자인 경우)
			output += input.valueOf(tmp).toLowerCase();	//내장함수를 이용해서 소문자로 변환
		}else if( (97 <= tmp) && (tmp <= 122)) { //문자가 97 <= tmp <= 122인 경우 (소문자인 경우)
			output += input.valueOf(tmp).toUpperCase();	//내장함수를 이용해서 대문자로 변환
		}else {	//그 외의 문자열인 경우
			output += (char)tmp;	//그대로 넣는다.
		}
	}
	
	System.out.println("변환된 문자열 : " + output);		// 최종적으로 변환한 글자열인 output을 출력
	
}	
}