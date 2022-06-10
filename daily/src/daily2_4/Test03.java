package daily2_4;

public class Test03 {

	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			System.out.print("i="+ i +" ");
			for(int j = 0; j <= i; j++) {
				System.out.print("j="+ j);
				System.out.print(","+" ");
			}
			System.out.println();
		}
	} 
}
