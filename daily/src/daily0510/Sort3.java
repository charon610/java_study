package daily0510;

import java.util.Scanner;

public class Sort3 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("첫번째 정숫값 : ");
		int a = stdIn.nextInt();

		System.out.println("두번째 정숫값 : ");
		int b = stdIn.nextInt();

		System.out.println("세번째 정숫값 : ");
		int c = stdIn.nextInt();

		
		if(a>b) {
			int t = a; a=b; b=t;
		}
		if(b>c) {
			int t = b; b=c; c=t;
		}
		if(a>b) {
			int t = a; a=b; b=t;
		}
		
		System.out.println("a<=b<=c가 되도록 정렬했습니다.");
		System.out.println("변수 a는 "+a+"입니다.");
		System.out.println("변수 b는 "+b+"입니다.");
		System.out.println("변수 c는 "+c+"입니다.");
		
	}

}
