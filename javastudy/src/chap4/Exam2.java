package chap4;
/*
 * ch의 문자가 대문자/소문자/숫자/기타문자인지 출력하기
 * [결과]
 * A:대문자
 * 
 * b:소문자

 * 1:숫자
 * 
 * -:기타문자
 * 
 * 대문자범위 : ch >='A' && ch <='Z'
 * 소문자범위 : ch >='a' && ch <='z'
 * 숫자범위 : ch >='0' && ch <='9'
 * 그외 기타문자
 */
public class Exam2 {
	public static void main(String[] args) {
		char ch = '-';
		System.out.print(ch + ":");
		if(ch>='A' && ch <= 'Z') {
			System.out.println("대문자");
		} else if (ch>='a' && ch <= 'z') {
			System.out.println("소문자");
		} else if (ch>='0' && ch <= '9') {
			System.out.println("숫자");
		} else {
			System.out.println("기타문자");
		}
		System.out.println("A:"+(int)'A');
		System.out.println("a:"+(int)'a');
		System.out.println("Z:"+(int)'Z');
		//대문자 + 32 => 소문자코드값
		System.out.println("A의 소문자:" + (char)('A'+32));
	}
}
