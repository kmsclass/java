package test1030;
/*
 * 숫자 맞추기 게임
 * 시스템이 4자리의 서로 다른 수를 저장한 후
 * 사용자가 저장된 수를 맞추는 게임
 *    자리수도 맞는 경우 : 스트라익
 *    자리수는 틀리지만 숫자가 존재하면 : 볼
 *  4스트라익이 되면 정답
 *  
 *  알고리즘
 *  1. 시스템이 중복 되지 않도록 서로다른 4자리 수 저장(0 ~ 9)
 *  2. 화면으로 부터 4자리 정수를 입력
 *  3. 시스템의 수와 입력된 수를 비교하여
 *     스트라익, 볼을 결정, 화면 출력
 *  4. 4스트라익이 될때 까지 2,3 을 계속 실행  
 *  5. 정답인 된경우 몇번만에 정답을 맞췄는지 
 *     입력 갯수를 화면에 출력하기
 */

import java.util.Scanner;

public class Test4_A {
	public static void main(String[] args) {
		int numarr[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		String answer = ""; // 시스템이 저장한 4개의 숫자
		for (int i = 0; i <= 1000; i++) {
			int f = (int) (Math.random() * 10);
			int t = (int) (Math.random() * 10);
			int temp = numarr[f];
			numarr[f] = numarr[t];
			numarr[t] = temp;
		}
		for (int i = 0; i < 4; i++) {
			answer += numarr[i];
		}
		System.out.println(answer);
		Scanner scan = new Scanner(System.in);
		int cnt = 0;
		while (true) {
			System.out.println("서로다른 4자리 정수를 입력하세요");
			String rcvNum = scan.nextLine();
			cnt++;
			int strike = 0;
			int ball = 0;
			for (int i = 0; i < answer.length(); i++) {
				for (int j = 0; j < rcvNum.length(); j++) {
					if (answer.charAt(i) == rcvNum.charAt(j)) {
						if (i == j)
							strike++;
						else
							ball++;
						break;
					}
				}
			}
			if (strike == 4) {
				System.out.println(rcvNum + "정답입니다.");
				System.out.println(cnt + "번 만에 맞추셨습니다. 게임을 종료합니다.");
				break;
			} else {
				System.out.println(rcvNum + ":" + strike + "스트라익, " + ball + "볼");
			}
		}
		scan.close();
	}
}
