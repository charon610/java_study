package daily2_3;

import java.util.Arrays;
import java.util.Random;

public class Test05 {
	public static void main(String[] args) {
		int[] arr = new int[10]; // 배열 크기 10으로 지정한다.
		System.out.println("10개의 랜덤한 수");
		Random rd = new Random();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(100)+1;     // 랜덤한 수 10개 입력
		}
		
		System.out.println("랜덤한 10개의 수");
		for (int i = 0; i < arr.length; i++) {    // 10개의 수 출력
			System.out.print(arr[i] + " ");
		}

		int max = arr[0];   // 0인덱스 임의로 최대값 설정
		int min = arr[0];   // 0인덱스 임의로 최대값 설정
		
		for(int a = 1; a < arr.length; a++) {  // 새로운 값과 이전값을 차례대로 비교하며 최대 최소값 출력
			if(max < arr[a])
				max = arr[a];
			if(min > arr[a])
				min = arr[a];
		}
		System.out.println();
		
		System.out.println("최소값:" + min);
		System.out.println("최대값:" + max);
	}
}
