package daily1_13;

class HumanTester {
	public static void main(String[] args) {
		Human stark = new Human();
		Human thor = new Human();

		stark.name = "스타크";
		stark.height = 180.5;
		stark.weight = 86.2;

		thor.name = "토르";
		thor.height = 191.8;
		thor.weight = 100.3;

		System.out.println("이름 : " + stark.name);
		System.out.println("신장 : " + stark.height);
		System.out.println("체중 : " + stark.weight);
		System.out.println();

		System.out.println("이름 : " + thor.name);
		System.out.println("신장 : " + thor.height);
		System.out.println("체중 : " + thor.weight);
	}
}
