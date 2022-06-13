package daily2_5;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);		
		System.out.print("첫번째 정수 : ");
        String a = sc.next();
		System.out.print("두번째 정수 : ");
		String b = sc.next();

		int intA = Integer.parseInt(a);
		int intB = Integer.parseInt(b);
		
		System.out.println("두 값의 합은 : " + (intA + intB));
		
	}
}