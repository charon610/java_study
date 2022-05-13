package daily0513;

import java.util.Scanner;

public class SeosonRepeat {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		int retry;
		do {
			int month;
			do {
				System.out.print("월(月) 입력하면 계절을 출력합니다 : ");
				month = stdIn.nextInt();
			} while (month<1 || month>12);
				
			if (month>=3 && month<=5)
				System.out.println("봄");
			else if (month>=6 && month<=8)
				System.out.println("여름");
			else if (month>=9 && month<=11)
				System.out.println("가을");
			else
				System.out.println("겨울");
			
			System.out.println("다시 하시겠습니까? 1.YES / 2.NO");
			retry=stdIn.nextInt();
		} while(retry==1);
		
		}
	}

