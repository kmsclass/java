package chap2;
/*
 * 문자 데이터
 */
public class VarEx2 {
	public static void main(String[] args) {
		char ch1 = 'A'; //문자형은 한개의 문자만 저장 가능.작은따옴표로 표현함
		int num = ch1;  //int <- char 형변환
		System.out.println(ch1 + "=" + num); //A=65. A문자의 아스키코드값
		num = ch1 + 1;
		System.out.println((char)num); //B
		
//		char ch2 = 'AB'; //문자형은 두개이상의 문자 저장 안됨
//		char ch2 = '';   //문자형은 반드시 한개만 저장 가능
		
		String str = "ABC"; //문자열형은 큰따옴표로 표현함
		System.out.println(str);
		String str2 = ""; //빈문자열 가능함
	}
}
