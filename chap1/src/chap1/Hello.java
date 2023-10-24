package chap1;
/*
 * 주석(comment) : 컴파일 되지 않는 영역. 기계어 번역 안됨
 *                문법과 상관없이 소스의 설명등을 기술함.
 */
/* 여러줄 주석 :  */
// 한줄주석 : // 부분이 주석임.
/*
 * java 실행 단계
 * 1. 소스 코딩 : Hello.java
 * 2. 컴파일 단계 : javac Hello.java => 바이트코드(Hello.class) 생성
 *      javac : 자바 컴파일러
 * 3. 실행 단계 : java Hello   => 바이트코드 실행.
 *      java : 자바 인터프리터
 *      - 자바가상머신(JVM) 환경 생성
 *      - 바이트코드를 메모리에 로드함. 바이트코드 여부 검증
 *      - main 메서드를 찾아서 실행
 */
public class Hello {
	public static void main(String[] args) { //프로그램의 시작.
		//System.out : 표준 출력 => 콘솔(화면) 출력
		System.out.println("Hello World");
		System.out.println("Hello Java");
	}
}
