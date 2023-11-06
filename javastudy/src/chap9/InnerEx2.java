package chap9;
/*
 * 외부클래스의 private 멤버를 중첩 클래스에서 접근
 */
class Outer2 {
	private int outeriv = 10;
	private static int outercv = 20;
	class InstanceInner {
		int iiv = outeriv;
		int iiv2 = outercv;
	}
	static class StaticInner {
//		int siv = outeriv;  //객체화 필요.
		int siv = new Outer2().outeriv;
		static int scv = outercv; 
		int siv2 = outercv;
	}
	//LocalInner.method() 호출하기
	void method(int pv) { //pv=30
		int max = 1000; //지역변수
//		max++;
		class LocalInner {
			int liv = outeriv;
			int liv2 = outercv;
/* 지역중첩클래스의 멤버메서드에서 외부메서드의 지역변수는 상수화 되어야 한다.
 * 지역변수의 변경이 없는 경우는 상수로 판단함.
 * 지역변수의 변경이 되는 경우는 오류 발생 */
			void method(int num) { //LocalInner의 멤버 메서드
				//num=3
				outeriv++;
				outercv++;
				liv++;
				liv2++;
				System.out.println("outeriv="+outeriv); //10
				System.out.println("outercv="+outercv); //20
				System.out.println("liv="+liv); //10
				System.out.println("liv2="+liv2); //20
				num = liv + liv2;
				System.out.println("num="+num); //30
//				pv++;
				System.out.println("pv="+pv); //30
				System.out.println("max="+max); //1000
			}
		}
		LocalInner li = new LocalInner();
		li.method(3);
	}
}
public class InnerEx2 {
	public static void main(String[] args) {
		Outer2 out = new Outer2();
		 //InnerEx2 클래스에서 Outer2의 private 멤버 접근 불가		
//		System.out.println(out.outeriv);
//		System.out.println(out.outercv);
		//InstanceInner, StaticInner의 멤버변수를 화면 출력하기
		Outer2.InstanceInner in = out.new InstanceInner();
		Outer2.StaticInner sn = new Outer2.StaticInner();
		System.out.println(in.iiv);
		System.out.println(in.iiv2);
		System.out.println(sn.siv);
		System.out.println(sn.siv2);
		System.out.println(sn.scv);
		System.out.println(Outer2.StaticInner.scv);
		out.method(30);
	}
}
