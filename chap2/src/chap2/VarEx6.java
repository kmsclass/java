package chap2;
/*
 * String 클래스의 + 연산
 *   1. 참조자료형. 문자열객체
 *   2. 클래스 중 유일하게 =(대입연산자) 객체 생성이 가능함.
 *   3. 클래스 중 유일하게 + 연산자 사용 가능함
 *       String = String + 기본자료형
 */
public class VarEx6 {
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = str1 + 100; //  String <= String + int
		System.out.println("str2="+ str2);
		str2 = str1 + 1+2+3;
		System.out.println("str2="+ str2);
		str2 = 1+2+3+str1;
		System.out.println("str2="+ str2); //한줄 출력
		System.out.print(1);  //옆칸으로 출력
		System.out.print(2);
		System.out.print(3);
		System.out.println();//
		//printf : format을 지정하여 출력
		// %d : 10진정수출력
		System.out.printf("%d\n",12345); //10진수 12345 출력
		System.out.printf("%10d\n",12345);//10자리 확보하여 10진수 12345 출력
		// %f : 부동소숫점 출력. 실수 출력
		System.out.printf("%f\n",123.45);
		// %.1f : 실수 출력. 소숫점이하 1자리로 출력. 반올림함
		System.out.printf("%.1f\n",123.43);
	}
}
