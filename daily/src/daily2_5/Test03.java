package daily2_5;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
        System.out.println("첫번째 정수에서 두번째 정수를 나눕니다.");
        System.out.print("첫번째 정수 : ");
        int a = sc.nextInt();
        System.out.print("나눌 숫자 : ");
        int b = sc.nextInt();
        System.out.println();
        try {
        	int div = a/b;
        	System.out.print("결과 값은 : " + div);
        } catch (Exception e) {
            System.err.println("0이 아닌 숫자를 입력해주세요. " + e);
        }
    }
}