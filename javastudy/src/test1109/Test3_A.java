package test1109;
/*
* 다음 결과가 나오도록 정의된 메서드를 구현하기
* 메서드명 : fillZero
* 기능 : 주어진 문자열로 주어진 길이의 문자열로  만들고, 
*       왼쪽 빈 공간은 -으로 채운다.
*       만일 주어진 문자열이 null이거나 
*       문자열의 길이가 length의 값과 같으면 그대로 반환한다.
*       만일 주어진 length의 값이 0과 같거나 작은 값이면 
*       빈 문자열("")을 반환한다.
* 반환타입 : String
* 매개변수 : String src, int length

[결과]
----A12345

A12
null
*/

public class Test3_A {
	public static void main(String[] args) {
		  String src = "A12345";
		  System.out.println(fillZero(src, 10));
		  System.out.println(fillZero(src, -1));
		  System.out.println(fillZero(src, 3));
		  System.out.println(fillZero(null, 3));
	}
	 static String fillZero(String str,int len) {
		 if(str == null) return null;  //문자열객체가 없음.
		 if(len <= 0) return "";	//문자열의 길이가 0이하인 경우	 
		 //문자열의 길이 >= 길이 
		 if(str.length() >= len) return str.substring(0,len);
		 //str.length() <  len 경우.
		 StringBuffer sb = new StringBuffer();
		 for(int i=0;i<str.length();i++) {
			 sb.append('-');
		 }
		 sb.replace(len-str.length(), len, str);
		 return sb.toString();
	 }
	
}
