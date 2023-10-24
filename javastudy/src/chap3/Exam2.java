package chap3;

import java.util.Scanner;

/*
 * 키보드에서 초를 입력받아 몇시간몇분몇초인지 출력하기
 * 
 * 1. Scanner 객체 생성
 * 2. int second = scan.nextInt()
 * 3. 시 : second/3600
 * 4. 분 : (second%3600)/60
 * 5. 초 : second % 60
 *
 * [결과]
 * 초를 입력하세요
 * 3662
 * 1시간1분2초
 */
public class Exam2 {
	public static void main(String[] args) {
		// 1. Scanner 객체 생성
		Scanner scan = new Scanner(System.in);
		System.out.println("초를 입력하세요");
		//2
		int second = scan.nextInt();
		//3 
		int h = second/3600;
		int m = (second%3600)/60;
		int s = second%60;
		System.out.printf("%d시간%d분%d초\n",h,m,s);
		System.out.printf("%d시간%d분%d초\n",
				second/3600,(second%3600)/60,second%60);
		System.out.println(h+"시간"+m+"분"+s+"초");
	}
}
