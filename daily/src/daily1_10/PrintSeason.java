package daily1_10;

import java.util.Scanner;

public class PrintSeason {
	static void printSeason(int m) {
		if(m>=3 && m<=5)
			System.out.print("\"봄\"");
		else if(m>=6 && m<=8)
			System.out.print("\"여름\"");
		else if(m>=9 && m<=11)
			System.out.print("\"가을\"");
		else
			System.out.print("\"겨울\"");
		
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		do {
			System.out.print("달을 입력하세요 : ");
			n = stdIn.nextInt();
		}while(n>12 || n<1);
		
		System.out.print(n + "월은 ");
		printSeason(n);
		System.out.print("입니다"); 
		
	}

}
