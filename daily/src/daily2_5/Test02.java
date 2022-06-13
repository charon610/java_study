package daily2_5;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
        try {
            System.out.print("숫자 입력 : ");
            int a = sc.nextInt();
            System.out.println("입력값 : "+a);
        } catch (Exception e) {
            System.err.println("숫자를 입력해주세요.");
        }
    }
}

