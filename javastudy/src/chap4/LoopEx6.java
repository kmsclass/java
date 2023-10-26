package chap4;

import java.util.Scanner;

/*
 * 1~100사이의 임의의 수를 컴퓨터가 저장함
 * 사용자는 숫자를 입력받아서 저장된 숫자를 맞추기
 * 시스템:37가정
 * [결과]
 * 1~100사이의 숫자 입력 : 50
 * 작은수 입니다.
 * 1~100사이의 숫자 입력 : 25
 * 큰수 입니다.
 * 1~100사이의 숫자 입력 : 35
 * 큰수 입니다.
 * 1~100사이의 숫자 입력 : 37
 * 정답입니다.
 * 프로그램 종료
 */
public class LoopEx6 {
	public static void main(String[] args) {
		//1 ~ 100 사이의 임의의 수
		int sysnum = (int)(Math.random() * 100) + 1;
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("1~100사이의 숫자 입력 : ");
			int data = scan.nextInt();
			if(sysnum > data) System.out.println("큰수 입니다.");
			else if (sysnum < data) System.out.println("작은수 입니다.");
			else if (sysnum == data){
				System.out.println("정답입니다.");
				break; //반복문 종료
			}
		}
		System.out.println("프로그램 종료");
	}
}
