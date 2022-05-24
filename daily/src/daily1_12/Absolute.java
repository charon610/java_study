package daily1_12;

import java.util.Scanner;

public class Absolute {
	static int absolute(int x) {
		if(x < 0)
			x = -x;
		return x;
	}
	
	static long absolute(long x) {
		if(x < 0)
			x = -x;
		return x;
	}
	
	static float absolute(float x) {
		if(x < 0)
			x = -x;
		return x;
	}
	
	static double absolute(double x) {
		if(x < 0)
			x = -x;
		return x;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("입력한 값의 절댓값 구하기");
		System.out.print("int 정수 a: "); int a = stdIn.nextInt();
		System.out.print("long 정수 b: "); long b = stdIn.nextLong();
		System.out.print("float 실수 c: "); float c = stdIn.nextFloat();
		System.out.print("double 실수 d: "); double d = stdIn.nextDouble();
		System.out.println("a 의 절대값은 " + absolute(a));
		System.out.println("b 의 절대값은 " + absolute(b));
		System.out.println("c 의 절대값은 " + absolute(c));
		System.out.println("d 의 절대값은 " + absolute(d));
		
	}

}
