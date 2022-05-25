package daily1_13;

public class HumanTester1 {

	public static void main(String[] args) {
		Human1 stark = new Human1("stark", 181.5, 81.6);
		Human1 thor = new Human1("thor", 190.7, 98.4);
		
		stark.gainWeight(3.2);
		thor.reduceWeight(2.6);
		
		System.out.println("이름 : " + stark.getName());
		System.out.println("신장 : " + stark.getHeight() + "cm");
		System.out.println("체중 : " + stark.getWeight() + "kg");
		System.out.println();
		
		System.out.println("이름 : " + thor.getName());
		System.out.println("신장 : " + thor.getHeight() + "cm");
		System.out.println("체중 : " + thor.getWeight() + "kg");
		System.out.println();
	}
}
