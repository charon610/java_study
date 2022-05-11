package daily0509;

import java.util.Scanner;

public class Grade1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("점수를 입력하세요 : ");
		int n = stdIn.nextInt();
		
		if(n>=90)
			System.out.println("수");
		else if(n>=80)
			System.out.println("우");
		else if(n>=70)
			System.out.println("미");
		else if(n>=60)
			System.out.println("양");
		else
			System.out.println("가");
	}

}
