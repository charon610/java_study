package p314;

public class Tire {
	// 필드
	public int maxRotation;
	public int accumulatedRototation;
	public String location;

	// 생성자
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}

	// 메소드
	public boolean roll() {
		++accumulatedRototation; // 누적 회전수 1증가
		if (accumulatedRototation < maxRotation) {
			System.out.println(location + "Tire 수명: " + 
			(maxRotation - accumulatedRototation)+"회");
			return true;
		} else {
		System.out.println("*** "+location+"Tire 펑크 ***");
		return false;
		}
	}
}
