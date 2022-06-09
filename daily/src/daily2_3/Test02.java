package daily2_3;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
		   System.out.print("지정할 값을 입력하세요: ");    // 기준이 되는 숫자 입력
		      int a = scan.nextInt();
		                                          
		   System.out.print("시프트 할 방향을 입력하세요 (0=<<, 1=>>): ");   // 시프트 방향을 0,1로 입력
		      int l = scan.nextInt();
		   
		   System.out.print("시프트 할 값을 입력하세요: ");  // 시프트 값을 입력
		      int r = scan.nextInt();

		   System.out.println();
		      

		      if(l == 0) {                  // 시프트 방향을 왼쪽으로 입력했을 경우 
		         System.out.print(a<<r);
		         }
		      else                          // 시프트 방향을 오른쪽으로 입력했을 경우
		         System.out.print(a>>r);
	}
}