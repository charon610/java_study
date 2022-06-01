package daily1_18;

import daily1_15.Day;

//human 버전5 클래스는 인간 클래스이다.
//@author 시바타

public class Human {

    //이름을 나타내는 string형 필드
    private String name;
    //신장을 나타내는 int필드
    private int height;
    //체중 int 필드
    private int weight;
    //생일 Day 필드      
    private Day birthday;

    //사람 클래스 휴먼의 생성자
//    @param name 이름 문자열
//    @param height 신장 숫자
//    @param weight 체중 숫자
//    @param birthday 생일 날짜
 
    
    public Human(String name, int height, int weight, Day birthday) {
       this.name = name;
       this.height = height;
       this.weight = weight;
       this.birthday = new Day(birthday);
    }
    
    //이름 확인
    public String getName() { return name; }
    //신장 확인
    public int getHeight() { return height; }
    //체중 확인
    public int getWeight() { return weight; }
    //생일 확인
    public Day getBirthDay() {return new Day(birthday);}
    //살이 찐다. 인수에 지정한 값만큼 체중 증가.
    //@param w
    public void gainWeight(int w) {weight=w;}
    //살이 빠진다. 인수에 지정한 값만큼 체중 감소
    //@param w
    public void reduceWeight(int w) {weight-=w;}
    //이름 인장 체중을 표시한다.
    public void putData() {
       System.out.println("이름:" + name);
       System.out.println("신장:" + height +"cm");
       System.out.println("체중:" + weight +"kg");
    }

    //문자열 표현 반환
    
    @Override
    public String toString() {
       return "{" + name + ": " + height + "cm " + weight + "kg " + birthday +                   "출생}";
    }
 }