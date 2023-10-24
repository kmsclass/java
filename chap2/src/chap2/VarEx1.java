package chap2;

public class VarEx1 {
	public static void main(String[] args) {
		int num; //변수의 선언
		num = 100;  //변수의 초기화
		//num 변수를 콘솔 출력하기
		System.out.println(num);//100
		num=200;   //값을 변경
		System.out.println(num);//200
		int num2 = 100;  //선언과 초기화
		//num2의 값을 콘솔에 출력하기
		System.out.println(num2);//100
		//double 형변수 d를 선언하고 10.5값으로 초기화 하기. 화면 출력하기
		double d = 10.5;
		System.out.println(d);
		//문자형변수 c를 선언하고 A값으로 초기화 하기. 화면 출력하기
		char c = 'A';
		System.out.println(c);
		//논리형변수 b를 선언하고 true 값으로 초기화 하고, 화면 출력
		boolean b = true;
		System.out.println(b);		
		num = c;  //형변환
		System.out.println(num); //65		
		//2진 리터널값 저장하기
		num = 0b1011; // 2*2*2*1 + 2*2*0 + 2*1 + 1*1 => 11
		System.out.println(num); //11
		//8진 리터널값 저장하기
		num = 011;  //8*1 + 1*1 => 9
		System.out.println(num); //9
		//10진 리터널값 저장하기
		num = 11;  //10*1 + 1*1 => 11
		System.out.println(num); //11
		//16진 리터널값 저장하기
		num = 0x11;  //16*1 + 1*1 => 17
		System.out.println(num); //17
		
		
	}
}
