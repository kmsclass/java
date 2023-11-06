package test1106;
//Outer클래스의 내부 클래스 Inner1, inner2 의 멤버변수 iv의 값 출력
public class Test3_A {
	public static void main(String[] args) {
		System.out.println(new Outer1().new Inner1().iv);
		System.out.println(new Outer1.Inner2().iv);
	}
}