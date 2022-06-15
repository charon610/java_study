package daily2_7;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("완전수를 판별합니다.");
		System.out.print("정수를 입력 : ");
		int a = sc.nextInt();
		int cnt = 0;
		int sum = 0;
		int [] arr = new int [20];
		for(int i = 1; i<a; i++) {
			while(a%i == 0) {
				arr[cnt] = i;
				cnt++;
				break;
			}
		}
		for(int i= 0; i<cnt; i++) {
			sum += arr[i];
		}
		if(sum == a) 
			System.out.println(a+"는(은) 완전수입니다.");
		else
			System.out.println(a+"는(은) 완전수가 아닙니다.");
		
		for(int i = 0; i<cnt; i++)
				System.out.print(arr[i] + " ");
		System.out.println();
		System.out.println("약수들의 합 : " + sum);
		
	}
}
