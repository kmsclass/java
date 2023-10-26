package chap4;

import java.util.Scanner;

/*
 * 화면에 999숫자가 입력될때 까지 숫자를 입력받아서, 입력받은 숫자의 합을 구하기
 */
public class LoopEx5 {
	public static void main(String[] args) {
		int sum = 0;
		System.out.println("숫자를 여러개 입력하세요(종료:999)");
		Scanner scan = new Scanner(System.in);
		while(true) { //무한반복. 반복문 내부에서 break로 반복종료함. 
			int num = scan.nextInt(); //
			if(num == 999) break;
			sum += num;  //1+2+3+4+5
		}
		System.out.println("입력받은 수의 합:" + sum); //15
	}
}
