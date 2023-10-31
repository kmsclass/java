package chap6;
/*
 * Rectangle2 클래스 생성하기
 *  멤버변수 : 가로(width),세로(height),사각형번호(sno), 생성된 사각형갯수(cnt)
 *  멤버메서드 : 넓이(area),둘레(length) 출력
 *             toString
 *    toString : 1번사각형:가로(10),세로(20), 생성된사각형갯수(1)        
 */
class Rectangle2 {
	int width,height,sno;
	static int cnt;
	void area() {
		System.out.println("넓이:"+(width*height));
	}
	void length() {
		System.out.println("둘레:"+((width+height)*2));
	}
	public String toString() {
		return 
		sno+"번사각형:가로("+width+"),세로("+height+"),생성된사각형갯수("+cnt+")";
	}
}
public class Exam2 {
	public static void main(String[] args) {
		//가로,세로:10,20인 1번 사각형 객체를 생성하여 r1 참조변수에 저장하기
		//1번사각형의 넓이,둘레 출력
		//1번사각형의 정보를 출력하기
		Rectangle2 r1 = new Rectangle2();
		r1.width = 10;
		r1.height = 20;
		r1.sno = ++Rectangle2.cnt;
		r1.area();
		r1.length();
		System.out.println(r1);
		//가로,세로:20,30인 2번 사각형 객체를 생성하여 r2 참조변수에 저장하기
		//2번사각형의 넓이,둘레 출력
		//2번사각형의 정보를 출력하기
		Rectangle2 r2 = new Rectangle2();
		r2.width = 20;
		r2.height = 30;
		r2.sno = ++Rectangle2.cnt;
		r2.area();
		r2.length();
		System.out.println(r2);
		System.out.println(r1);  //생성된사각형의 갯수 2
		
	}
}
