package daily2_3;

public class Test04 {

	public static void main(String[] args) {
		for(int i = 50; i <= 100; i++) {
			if(i%3 == 0 && i%2 !=0)       // i가 3의 배수이면서 2의 배수가 아닌 수를 출력 
				System.out.println(i);
		}
	}
}