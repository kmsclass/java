package chap2;
//특수문자 : escape 문자
//  특정의미를 부여하는 문자
public class VarEx3 {
	public static void main(String[] args) {
		String str = "홍길동이 말했습니다. \"안녕\"";
		System.out.println(str);
		char ch = '\'';
		System.out.println(ch);
		// \t : tab 표현
		System.out.println("홍길동\t김삿갓\t이몽룡");
		// \n : new line 표현. 
		System.out.println("홍길동\n김삿갓\n이몽룡");
		ch = '\\';
		System.out.println(ch);
		//  c:\20231012 문자열 출력하기
		str = "c:\\20231012";
		System.out.println(str);
		System.out.println("c:\\20231023");
		ch = '\u0041';
		System.out.println(ch); //A		
	}
}
