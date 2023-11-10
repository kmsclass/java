package chap11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 정규표현식 : 문자의 형식 지정하는 기능
 */
public class RegularEx1 {
	public static void main(String[] args) {
		String[] data = {"bat","baby","bonus","cA","ca","co","c.",
				         "car","combat","count","cTT","data","disk","c"};
		/*
		 * c[a-zA-Z]+ : c로 시작하고 대문자또는소문자 한개이상으로 이루어진 문자
		 * c : c문자로 시작
		 * [a-zA-Z] : 대소문자
		 * +  : 한개이상
		 * *  : 0개이상
		 * ?  : 0개또는한개
		 */
		Pattern p = Pattern.compile("c[A-Za-z]?");  //정규표현식 객체
		for(String s : data) {
			Matcher m = p.matcher(s); //정규표현식과 일치하는지 검증객체
			//m.matches() : 
			//   Pattern 객체에 설정된 표현식과 일치하면 true, 일치하지 않으면 false
			if(m.matches()) System.out.print(s + ",");
		}
		System.out.println();
		String names = "홍길동,    김삿갓   ,  이몽룡,성춘향,   임꺽정    ";
		// \s* : 공백0개이상
		//  \s : 공백의미 
		//  * : 0개이상
		String[] arr = names.split("\\s*,\\s*");// , 앞뒤의 공백들까지를 분리문자로 이용
		for(String s : arr) {
			System.out.println("==="+ s+"===");
		}
	}
}
