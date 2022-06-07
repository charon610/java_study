package daily2_1;

public class test05 {

	public static void main(String[] args) {
	      double roundresult = Math.round(3.14); // 반올림 구하기
	      double ceilresult = Math.ceil(3.5);    // 올림 구하기
	      int powresult = (int) Math.pow(3,2 );  // 거듭제곱 구하기
	      int sqrtresult = (int) Math.sqrt(16);  // 제곱근 구하기
	      int randomresult = (int) (Math.random() * 6) + 1 ; // 랜덤 숫자 구하기
	      int absresult = Math.abs(-5);          // 절댓값 구하기
	      double cbrtresult = Math.cbrt(5);      // 세제곱근 구하기
	      
	      System.out.println("반올림 : " + roundresult);
	      System.out.println("올림 : " +ceilresult);
	      System.out.println("거듭제곱 : " +powresult);
	      System.out.println("제곱근 : " +sqrtresult);
	      System.out.println("랜덤숫자 : " +randomresult);
	      System.out.println("절댓값 : " +absresult);
	      System.out.println("세제곱근 : " +cbrtresult);                        
	   }
	}