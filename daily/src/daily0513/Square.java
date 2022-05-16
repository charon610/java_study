package daily0513;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("몇 단의 정방향을 만들까요? : ");
		int n = stdIn.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.print("*");
			for(int j=0; j<n-1; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	}

}
