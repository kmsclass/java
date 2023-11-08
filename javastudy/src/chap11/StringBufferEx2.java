package chap11;
/*
 * StringBuffer의 주요 메서드
 */
public class StringBufferEx2 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer(); //빈공간의 버퍼
		//sb.append("abc") : sb 객체에 abc 문자열 추가
		sb.append("abc").append(123).append('A').append(false);
		System.out.println(sb); //abc123Afalse
		sb.delete(2,4);   //2번인덱스부터 3번인덱스까지 문자를 제거
		System.out.println(sb);  //ab23Afalse
		sb.deleteCharAt(4); //4번인덱스의 문자 제거
		System.out.println(sb); //ab23false
		sb.insert(5,"==");  //5번인덱스에 == 문자열 추가
		System.out.println(sb); //ab23f==alse
		sb.insert(6,1.23);  //6번인덱스에 1.23숫자 추가
		System.out.println(sb); //ab23f=1.23=alse
		sb = new StringBuffer("ABCDEFG"); // ABCDEFG 문자열 저장
		sb.replace(0, 3, "abc");  //0번인덱스부터 2번인덱스까지 abc 문자열로 치환
		System.out.println(sb);   // abcDEFG
		sb.reverse();     //내용을 꺼꾸로  
		System.out.println(sb);  //GFEDcba

	}
}
