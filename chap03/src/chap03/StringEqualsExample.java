package chap03;

public class StringEqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		String strVar3 = new String("신민철");
		
		System.out.println(strVar1 == strVar2);
		System.out.println(strVar2 == strVar3);
		System.out.println();
		
		System.out.println(strVar1.equals(strVar2));
		System.out.println(strVar1.equals(strVar3));
		
		
	}

}
