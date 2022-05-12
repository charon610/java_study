package daily0511;

import java.util.Scanner;

public class PutAsteriskAlt1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("몇개의 *를 표시할까요? : ");
		int n = stdIn.nextInt();
		if (n > 0) {
			int i = 0;
			while (i < n) {
				if(i%2==0)
				System.out.print('*');
				else
					System.out.println('+');
			}
			System.out.println();
		}
	}

}
