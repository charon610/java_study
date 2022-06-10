package daily2_4;

public class People {
	public String name;  // 이름
	public Season season;  // 좋아하는 계절 
	
	public static void main(String[] args) {
		People people = new People();
		
		people.name = "토르";
		people.season = Season.AUTUMN;   // enum을 활용한 제한된 값 선택
		
		System.out.println("이름 : " + people.name);
		System.out.println("좋아하는 계절 : " + people.season);
	}
}
