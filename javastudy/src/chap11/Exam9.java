package chap11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//점수의 총점과 평균 출력하기
public class Exam9 {
	public static void main(String[] args) {
		String data ="번호:900,이름:홍길동,국어:100,영어:70,수학:85,과학:95";
//		Pattern p = Pattern.compile("\\d{2,3}");
//		Pattern p = Pattern.compile("[0-9]{2,3}");
		Pattern p = Pattern.compile("100");
		Matcher m = p.matcher(data);
		int sum=0,cnt=0;
		while(m.find()) {
			System.out.print(m.group()+",");
			cnt++;
			sum += Integer.parseInt(m.group());
		}
		System.out.println("총점:"+sum + ",평균:"+((double)sum/cnt));
	}
}
