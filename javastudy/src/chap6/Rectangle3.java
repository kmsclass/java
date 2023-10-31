package chap6;
/*
 * 멤버변수 : width,height,sno, cnt(클래스변수)
 * 멤버메서드 : 넓이값을 리턴하는 area(),
 *            둘레값을 리턴하는 length(),
 *            정사각형 여부를 리턴하는 isSquare()
 *            사각형의 정보를 리턴하는 toString() 
 */
public class Rectangle3 {
	int width,height,sno;
	static int cnt;
	int area() {
		return width*height;
	}
	int length() {
		return (width+height) * 2;
	}
	boolean isSquare() {
		return width==height;
	}
	public String toString() {
	  return sno+"번사각형=>("+width+","+height+"),넓이:"+area()+",둘레:"+length()+
			","+((isSquare()?"정사각형":"직사각형"))+",사각형갯수:"+cnt;
	}
}
