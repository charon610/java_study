package daily2_1;

public class test02 {

	public static void main(String[] args) {

		// 1//
		int intValue = 45900;
		char charValue = (char) intValue;
		System.out.println(charValue);
		// 2//
		long longValue = 9999L;
		System.out.println(longValue);
		// 3//
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue);
		// 4//
		int num1 = 1234567890;
		int num2 = 1234567890;

		float num3 = num2;
		num2 = (int) num3;
		int result = num1 - num2;
		System.out.println(result);
	}
}
