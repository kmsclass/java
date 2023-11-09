package chap11;

import java.text.SimpleDateFormat;
import java.util.Date;
/*
 * Date : 날씨 표시 클래스
 * SimpleDateFormat : 형식화클래스. java.text 패키지의 클래스
 *   패턴으로 사용되는 문자
 *     yyyy : 년도4자리
 *     MM   : 월2자리
 *     dd   : 일자2자리
 *     HH   : 시간 2자리
 *     mm   : 분2자리
 *     ss   : 초2자리
 *     E    : 요일
 *     a    : 오전/오후
 */
public class DateEx1 {
	public static void main(String[] args) {
		Date now = new Date(); //현재 일시
		System.out.println(now);
		SimpleDateFormat sf =
				new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E a");
		System.out.println(sf.format(now));
	}
}
