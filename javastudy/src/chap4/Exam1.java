package chap4;

import java.util.Scanner;

/*
 * 정수를 입력받아서
 * 1. 양수/음수/영  출력
 * 2. 짝수/홀수 출력
 */
public class Exam1 {
	public static void main(String[] args) {
		System.out.println("정수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.print(num + ":");
		if (num > 0) {
			System.out.println("양수");
		} else if (num < 0) {
			System.out.println("음수");
		} else if (num == 0){
			System.out.println("영");
		}
		System.out.print(num + ":");
		if(num%2==0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
	}
}
