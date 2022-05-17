package daily1_07;

public class SquareFloat {

	public static void main(String[] args) {
		System.out.println(" x    x의 제곱");
		System.out.println("--------------");
		
		for (float i= 0.0F; i <1.0F; i=i+0.001F)
			System.out.printf("%5.3f  %10.7f\n", i, i * i);
	}

}
