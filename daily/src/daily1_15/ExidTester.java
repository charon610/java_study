package daily1_15;

public class ExidTester {

	public static void main(String[] args) {
		Exid a = new Exid();
		Exid b = new Exid();
		Exid c = new Exid();
		Exid.setStep(4);
		Exid d = new Exid();
		Exid e = new Exid();
		Exid f = new Exid();
		
		System.out.println("a의 식별 번호 : " + a.getId());
		System.out.println("b의 식별 번호 : " + b.getId());
		System.out.println("c의 식별 번호 : " + c.getId());
		System.out.println("d의 식별 번호 : " + d.getId());
		System.out.println("e의 식별 번호 : " + e.getId());
		System.out.println("f의 식별 번호 : " + f.getId());
		
		int max = Exid.getMaxId();
		System.out.println("마지막에 부여한 식별 번호 = " + max);
		System.out.println("다음에 부여할 식별 번호 = " + (max + Exid.getStep()));
	}
}
