package daily1_14;

public class HumanTester1 {

	public static void main(String[] args) {

		Human_ver3 gildong = new Human_ver3("길동", 170, 60, new Day(1975, 3, 12));
		Human_ver3 chulsu = new Human_ver3("철수", 166, 72, new Day(1987, 10, 7));
		
		System.out.println("gildong = " + gildong);
		System.out.println("gildong = " + chulsu);
	}
}