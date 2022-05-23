package daily1_11;

import java.util.Scanner;

public class LinearSearch {
	static int linearSearch(int a [], int key) {
		for (int i = 0; i<a.length; i++) 
			if(a[i] == key)
				return i;
			return -1;
		}
	
		static int linearSearchR(int a [], int key) {
			for (int i = a.length - 1; i>=0; i--) 
				if(a[i] == key)
					return i;
				return -1;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("배열의 요소 수 : ");
		int n = stdIn.nextInt();
		int a [] = new int [n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "]=");
			a[i] = stdIn.nextInt();
		}
		
		System.out.println("찾는 값 : ");
		int key = stdIn.nextInt();
		
		int idxTop = linearSearch(a, key);
		int idxBtm = linearSearchR(a, key);
		
		if (idxTop == -1)
			System.out.println("해당 값은 존재하지 않습니다.");
		else if (idxTop == idxBtm)
			System.out.println("해당 값은 x[" + idxTop + "]에 있습니다.");
		else {
			System.out.println("해당 값의 요소가 여러 개 있습니다." );
			System.out.println("가장 앞에 위치한 값은 x[" + idxTop + "에 있습니다.");
			System.out.println("가장 앞에 위치한 값은 x[" + idxBtm + "에 있습니다.");
		}
		
	}

}
