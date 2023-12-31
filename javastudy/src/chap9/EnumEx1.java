package chap9;
/*
 * 열거형 
 */
public class EnumEx1 {
	public enum Car { //열거행 객체
		ANANTE,SONATA,GRANDEUR,SM5,K7,K9  //미리 객체를 생성하여 설정
	}
	public static void main(String[] args) {
		Car car = Car.ANANTE;
		System.out.println(car);
		System.out.println(Car.K9);
		Car[] cars = Car.values();
		for(Car c : cars)
			//c.ordinal() : 열거행 객체의 순서. 0부터시작
			System.out.println(c + ":" + c.ordinal());
		if(car instanceof Object)
			System.out.println("car 객체는 Object 객체다");
	}
}
