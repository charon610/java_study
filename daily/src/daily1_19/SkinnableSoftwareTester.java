package daily1_19;

// 헤드마운트 디스플레이 클래스 사용 예
public class SkinnableSoftwareTester {

	public static void main(String[] args) {
		SkinnableSoftware x = new SkinnableSoftware();
		SkinnableSoftware y = new SkinnableSoftware(Skinnalbe.GREEN);
		
		x.changeSkin(Skinnalbe.YELLOW);  // x의 스킨을 노랑으로 변경
		
		System.out.println("x의 스킨은 " + x.getSkinString() + "입니다.");
		System.out.println("y의 스킨은 " + y.getSkinString() + "입니다.");
	}
}
