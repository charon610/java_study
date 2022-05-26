package p661;

import p658.Box;

public class BoxingMethodExample {

	public static void main(String[] args) {
		Box<Integer> box1 = Util.<Integer>boxing(100);
		int intValue = box1.get();
		System.out.println(intValue);
		
		Box<Integer> box2 = Util.boxing(35);
		int strValue = box2.get();
		System.out.println(strValue);
	}

}
