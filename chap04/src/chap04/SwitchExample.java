package chap04;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = (int)(Math.random()*6) + 1;
		
		switch (num) {
		case 1:
			System.out.println("1번이 나왔습니다.");
	
		case 2:
			System.out.println("2번이 나왔습니다.");
		
		case 3:
			System.out.println("3번이 나왔습니다.");

		case 4:
			System.out.println("4번이 나왔습니다.");

		case 5:
			System.out.println("5번이 나왔습니다.");
	
		default:
			System.out.println("6번이 나왔습니다.");
		}
		
		
	}

}
