package chap3;
/*
 * 단항 연산자 : 연산자의 피연산자가 한개인 경우
 *   1. 증감연산자 : ++, -- 
 *       ++ : 변수에 저장된 값을 1 증가
 *       -- : 변수에 저장된 값을 1 감소
 */
public class OpEx1 {
	public static void main(String[] args) {
		int x=5,y=5;
		x++;   //x의 값을 1 증가 : 6
		y--;   //y의 값을 1 감소 : 4
		System.out.printf("x=%d,y=%d\n",x,y);
		++x;   //x의 값을 1 증가 : 7
		--y;   //y의 값을 1 감소 : 3 
		System.out.printf("x=%d,y=%d\n",x,y);
		x=y=5;
		y = ++x;  //1.x의값증가(6) , 2. x의 값을 y에 대입
		System.out.printf("x=%d,y=%d\n",x,y);
		y = x++; //1. x의 값을 y에 대입, 2. x의 값을 증가
		System.out.printf("x=%d,y=%d\n",x,y);
		
		x=y=5;
		System.out.println("x="+ x++); //5  1.x의값을 출력. 2. x의값 증가 
		System.out.println("x="+ ++x); //7  1.x의값 증가    2. x의값 출력 
		System.out.println("y="+ y--); //5  1.y의값을 출력. 2. y의값 감소 
		System.out.println("y="+ --y); //3  1.y의값 감소    2. y의값 출력
	}
}
