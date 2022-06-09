package daily2_3;

public class Test03 {
	   public static void main(String[] args) {
	        int x = 0;
	        int y = 0;
	        System.out.println("후위 연산자");
		
	        //후위 증감연산자			
	        System.out.println(x++);	// 0이 그대로 출력된다 이 값이 출력한뒤에 x의 값이 1증가한다.
	        System.out.println(x);	// 1이 출력된다. 바로 위 라인에서 이 라인으로 넘어오기 직전 1로 값이 증가했으므로 1이 출력된다.
	        System.out.println(x--);	// 1이 출력된다. 이 라인에는 1을 출력하고 -1을 계산한다.
	        System.out.println(x);	// 0이 출력됨. 위에서 x의 값이 1에서 -1이 됬으므로 0이 출력됨
			
	        System.out.println();

	        System.out.println("전위 연산자");
		
	        //전위 증감연산자
	        System.out.println(++y);	// 1이출력됨 값을 출력하기전에 y의 값이 +1된다.
	        System.out.println(y);	// 1이 출력됨 바로 위 라인에서 y의 값이 1로 세팅됐기 때문이다
	        System.out.println(--y);	// 0이 출력된다. 값을 출력하기전에 y의 값이 1에서 -1된다
	        System.out.println(y);	// 0이 출력된다  위에서 y의 값이 0이기 때문이다
			
	    }		
	}