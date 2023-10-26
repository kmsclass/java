package chap4;

import java.util.Scanner;

/*
삼각형의 높이를 입력하세요
5
15	14	13	12	11	
	10	9	8	7	
		6	5	4	
			3	2	
				1
	   i   j	   * : i <= j : *, else 공백 		
  ***  1   1 2 3
   **  2   2 3 				 
    *  3   3 
 */
public class Exam9 {
	public static void main(String[] args) {
		System.out.println("삼각형의 높이를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int data = 0;  //h값까지의 합. 출력할 시작 숫자
		for(int i=1;i<=h;i++) data += i;
		for(int i=1;i<=h;i++) {
			for(int j=1;j<=h;j++) {
				if(i <= j) System.out.print(data-- + "\t");
				else System.out.print("\t");
			}
			System.out.println();
		}
	}
}
