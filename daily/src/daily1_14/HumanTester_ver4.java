package daily1_14;

public class HumanTester_ver4 {
	public static void main(String[] args) {
		Human_ver4 gildong = new Human_ver4("홍길동", 170, 60);
		Human_ver4 chulsu = new Human_ver4("김철수", 166, 72);
		
		gildong.putData();
		System.out.println("번호: " + gildong.getId());
		
		System.out.println();
		
		chulsu.putData();
		System.out.println("번호 : " + chulsu.getId());
	}
}
