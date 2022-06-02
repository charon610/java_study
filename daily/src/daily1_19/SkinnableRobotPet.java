package daily1_19;


// 스킨 변경이 가능한 로봇 애완견 클래스
public class SkinnableRobotPet extends RobotPet implements Skinnalbe {
	private int skin;    // 스킨
	
	// 생성자
	public SkinnableRobotPet(String name, String masterName, int skin) {
		super(name, masterName);    // 슈펴 클래스의 생성자
		this.skin = skin;
	}
	
	// 스킨 변경
	public void changeSkin(int skin) {
		this.skin = skin;
	}
	// 현재의 스킨을 표시
	public void printSkin() {
		switch(skin) {
		case BLACK : System.out.print("검정"); break;
		case RED : System.out.print("빨강"); break;
		case GREEN : System.out.print("초록"); break;
		case BLUE : System.out.print("파랑"); break;
		case YELLOW : System.out.print("노랑"); break;
		}
	}
}