package chap7;

import chap7.test.Modifier2;

class Modifier3 extends Modifier2 {
	public void method() {
		System.out.println("chap7.Modifier3 클래스의 method");
		System.out.println("v1="+v1);
		System.out.println("v2="+v2);
		System.out.println("v3="+v3);
		System.out.println("v4="+v4);
	}
}
public class ModifierEx2 { //chap7.ModifierEx2
	public static void main(String[] args) {
		Modifier2 m2 = new Modifier2(); //chap7.test.Modifier2
		m2.method();  //public 제어자이므로 정상
//		System.out.println(m2.v1); //Modifier2 클래스 내에서만 접근 허용
//		System.out.println(m2.v2); //chap7.test 패키지 내부의 클래스 에서만 접근 허용
//		System.out.println(m2.v3); //상속관계에서만 접근 허용
		System.out.println(m2.v4); //public 제어자이므로 정상
	}
}
