package daily0513;

import java.util.Scanner;

public class Square1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("정숫값 : ");
		int a = stdIn.nextInt();
		
		for(int i=1; i<=a; i++) {
			int b = i*i;
				System.out.println(b);
		}
				
	}

}
