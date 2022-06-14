package daily2_6;

public class Test03 {
	
	public static void main(String[] args) {
		System.out.println("2 또는 3의 배수 출력");
		for(int i=1; i<=20; i++) {
			if(i%2==0 || i%3==0)
				System.out.print(i + " ");
		}
	}

}
