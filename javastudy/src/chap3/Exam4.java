package chap3;

import java.util.Scanner;

/*
 * 숫자를 입력받아서 양수인 경우 "양수",음수인 경우 "음수", 0인 경우 "영" 출력하기
 * 1. Scanner 객체 생성
 * 2. int num = scan.nextInt()
 * 3. (num > 0)?"양수":(num < 0)?"음수":"영"
 *  
 * [결과] 
 * 숫자를 입력하세요
 * -10
 * -10 : 음수
 * 
 * 10
 * 10 : 양수
 * 
 * 0
 * 0 : 영
 */
public class Exam4 {
	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println(num + ":" +
		   ((num > 0)?"양수":(num < 0)?"음수":"영"));
		// 입력된 숫자의 절대값 출력하기
		// -10 : 10
		// 10 : 10
		System.out.println(num + "의 절대값:" + ((num >= 0)?num:-num));
	}
}
