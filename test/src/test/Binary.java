package test;

import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("10진수 입력 : ");

		int num = input.nextInt();
		int cnt = 0;
		int cnt2 = 0;
		int tmp = num;
		
		while(tmp>=1) {
			tmp = tmp/2;
			cnt++;
		}

		int [] bin = new int [cnt];
		
		while(num>=1) {
			bin[cnt2] = num%2;
			cnt2++;
			num = num/2;
			
		}
		for(int i = cnt2-1; i>=0; i--) {
			System.out.print(bin[i]);
		}
	}
}
