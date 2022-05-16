package test;

public class Grade {

	public static void main(String[] args) {
		int [] a = {98,70,45,60,83};
		int sum = 0;
		double avg = 0;
		int max = 0;
		int min = 999;
		
		for(int i = 0; i<a.length; i++) { 
		sum += a[i];
		
		if(a[i] > max) max = a[i];
		if(a[i] < min) min = a[i];
		}
		avg = (double)sum/a.length;
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("최고점수 : "+ max);
		System.out.println("최저점수 : "+ min);
		
		
	}

}
