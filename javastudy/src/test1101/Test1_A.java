package test1101;
/*
 * 구동 프로그램 실행시 다음의 결과가 나오도록
 * Rectangle 클래스 구현하기
 * [결과]
    1/5 사각형:(10,20) 면적:200, 둘레:60
    2/5 사각형:(15,25) 면적:375, 둘레:80
    3/5 사각형:(20,30) 면적:600, 둘레:100
    ...
    전체 사각형 면적의합 :1175
    전체 사각형 둘레의합 :240
 */
class Rectangle {
	int width, height, sno;
	static int cnt;
	Rectangle(int width, int height) { //생성자
		this.width = width;
		this.height = height;
		sno = ++cnt;  //사각형번호
	}
	int area() {
		return width * height;
	}
	int length() {
		return (width + height) * 2;
	}
	public String toString() {
		return sno + "/" + cnt + "(" + width + ","
				+ height + ")  면적:" + area() 
				+ ", 둘레:" + length();
	}
	
}
public class Test1_A {
	public static void main(String[] args) {
		Rectangle[] rarr = new Rectangle[5];
		int totarea = 0;
		int totlength = 0;
		for(int i=0;i<rarr.length;i++) {
			int width = (int)(Math.random() * 31) + 20;
			int height =(int)(Math.random() * 31) + 20; 
			rarr[i] = new Rectangle(width,height); //생성자
			totarea += rarr[i].area(); //area() 메서드 리턴타입 int
			totlength += rarr[i].length();//length() 메서드 리턴타입 int 
			System.out.println(rarr[i]);
		}
		for(Rectangle r : rarr) {
			System.out.println(r);
		}
		System.out.println("전체 사각형 면적의 합:" + totarea);
		System.out.println("전체 사각형 둘레의 합:" + totlength);
	}
}