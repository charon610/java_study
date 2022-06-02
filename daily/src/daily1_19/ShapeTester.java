package daily1_19;

// 도형 클래스군 사용 예
class ShapeTester {
	public static void main(String[] args) {
		Plane2D[] a = {
				new Rectangle(2, 5),       // 사각형
				new Parallelogram(2, 5),   // 평행 사변형
				
		};
		for(int i = 0; i < a.length; i++)
			System.out.println("a[" + i + "]의 면적=" + a[i].getArea());
	}
}
