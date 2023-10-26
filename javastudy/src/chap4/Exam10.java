package chap4;

import java.util.Scanner;

/*
 * 농장에 강아지,병아리가 있다.
 * 강아지,병아리의 전체 마리수와, 다리수를 입력받고,
 * 강아지의 마리수와, 병아리 마리수를 출력하기
 * [결과]
 * 마리수 입력 : 20
 * 다리수 입력 : 60
 * 강아지 : 10
 * 병아리 : 10
 */
public class Exam10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("마리수입력:");
		int cnt = scan.nextInt(); //2
		System.out.print("다리수입력:");
		int leg= scan.nextInt(); //2
		boolean check = false; //
//		int check = 0; //
		for (int x=0;x<=cnt;x++) { //x=2
			for(int y=0;y<=cnt;y++) { //y=2
				if((x+y==cnt) && ((4*x)+(2*y)==leg)) {
					System.out.println("강아지수:"+x);
					System.out.println("병아리수:" + y);
					check=true; //조건 만족
//					check++;
				}
			}
		}
		/*
		 * check == true : !check => false
		 * check == false : !check => true
		 */
		if(check) { //check==false
//		if(check==false) {
			System.out.println("계산안됨");
		}		
	}
}
