package daily1_15;

public class IdTester_ver2 {
	public static void main(String[] args) {
		Id_ver2 a = new Id_ver2();
		Id_ver2 b = new Id_ver2();
		
		System.out.println("a의 식별 번호 : " + a.getId());
		System.out.println("b의 식별 번호 : " + b.getId());
		
		System.out.println("마지막으로 부여한 식별 번호 = " + Id_ver2.getMaxId());
		System.out.println("마지막으로 부여한 식별 번호 = " + a.getMaxId());
		System.out.println("마지막으로 부여한 식별 번호 = " + b.getMaxId());
	}
}
