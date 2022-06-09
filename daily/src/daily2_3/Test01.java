package daily2_3;

import java.util.Scanner;

public class Test01 {
	static void trans(int a) {
		int n = a;                 // 입력된 파라미터를 n으로 초기화
		int [] b = new int [100];  // 배열 b에 100인덱스 설정

		int i = 0;
		while(n != 1) {            // 몫이 1이 될때까지 2로 나누고 나머지를 배열로 입력
			b[i++] = n%2;
			n = n/2;
		}
		b[i] = n;                  // 마지막 몫이 1일때 나머지를 마지막 인덱스에 저장  
		
		System.out.print("이진수 : ");
		for(int j = i; j>=0; j--)    // 입력된 배열 제일 끝값부터 처음까지 차례대로 출력
			System.out.print(b[j]);
		}
		
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("십진수 : ");
		int a = scan.nextInt();
		
		trans(a);
	}
}
