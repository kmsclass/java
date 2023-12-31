package chap6;
/*
 * 1. 직사각형클래스(Rectangle) 구현하기
 * 멤버변수: 가로(width),세로(height)
 * 멤버메서드 : void area() => 넓이 출력 기능
 * 멤버메서드 : void length() => 둘레 출력 기능
 * 
 * 2. 구동클래스(Exam1.java) : main 메서드가 존재하는 클래스
 *    - Rectangle 클래스의 객체 생성하여 r1 참조변수로 참조하기
 *    - 가로,세로 길이를 10,5 저장하기
 *    - r1 사각형의 넓이, 둘레 출력하기
 */
class Rectangle {
	int width,height; //멤버변수
	void area() {
		System.out.println(width*height);
	}
	void length() {
		System.out.println((width+height)*2);
	}
}
public class Exam1 {
	public static void main(String[] args) {
		//Rectangle 클래스의 객체 생성하여 r1 참조변수로 참조하기
		Rectangle r1 = new Rectangle();
		//가로,세로 길이를 10,5 저장하기
		r1.width=10;
		r1.height=5;
		//r1 사각형의 넓이, 둘레 출력하기
		System.out.print("넓이:");
		r1.area();
		System.out.print("둘레:");
		r1.length();
	}
}
