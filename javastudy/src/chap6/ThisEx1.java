package chap6;
/*
 * this,this() 예제
 */
class Car4{
	String color;
	int number;
	int sno;
	static int cnt;
	Car4(String color,int number) {
		System.out.println("Car4(String color,int number) 생성자 호출");
		this.color = color;
		this.number = number;
		this.sno = ++cnt;
	}
	Car4(){
		this("White",1111);
		System.out.println("Car4() 생성자 호출");
	}
	Car4(String color){
		this(color,1111);
		System.out.println("Car4(String color) 생성자 호출");
	}
	Car4(int number){
		this("White",number);
		System.out.println("Car4(int number) 생성자 호출");
	}
	public String toString() {
		return sno + "번자동차:"+color+","+number;
	}
}
public class ThisEx1 {
	public static void main(String[] args) {
		System.out.println("=== c1 객체 생성");
		Car4 c1 = new Car4("Blue",1234);
		System.out.println("=== c2 객체 생성");
		Car4 c2 = new Car4();
		System.out.println("=== c3 객체 생성");
		Car4 c3 = new Car4("Red");
		System.out.println("=== c4 객체 생성");
		Car4 c4 = new Car4(3333);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
	}
}
