package p314;

public class HankookTire extends Tire{
	//필드
	//생성자
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
		// TODO Auto-generated constructor stub
	}
	//메소드
@Override
	public boolean roll() {
	++accumulatedRototation;
	if(accumulatedRototation<maxRotation) {
		System.out.println(location + " KumhoTire 수명: "+ (maxRotation-accumulatedRototation) + "회");
		return true;
	  } else {
		System.out.println("*** " + location + " KumhoTire 펑크 ***");
		return false;
	  }
	}
}
