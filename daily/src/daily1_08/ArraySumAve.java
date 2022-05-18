package daily1_08;

import java.util.Scanner;

public class ArraySumAve {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("요소 수 : ");
		int n = stdIn.nextInt();	
		double a [] = new double [n];
		double sum = 0;
		
		for (int i = 0; i<n; i++) {
			System.out.print("요소를 입력하세요. : ");
			a[i] = stdIn.nextDouble();
		}
		
		for (int i = 0; i<n; i++) {
			sum = sum + a[i];
		}
		
		System.out.println("모든 요소의 합은 " + sum + "입니다");
		System.out.println("모든 요소의 평균은 " + sum/n + "입니다");

		
		

	}

}
