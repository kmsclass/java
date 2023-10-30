package chap5;

import java.util.Scanner;

/*
 * 배열을 사용하지 않음
[결과]
삼각형의 높이를 입력하세요
5
15 14 13 12 11 
   10  9  8  7 
       6  5  4 
          3  2 
             1
 */
public class Exam7 {
	public static void main(String[] args) {
		System.out.println("삼각형의 높이를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int len = scan.nextInt();
		int sum = 0; //숫자시작부분 저장
		for(int i=1;i<=len;i++) {
			sum += i;
		}
		int data = sum;
		for(int i=0;i<len;i++) {
			for(int j=0;j<len;j++) {
				if(i > j)  //%3c : char 문자 3자리로 출력.
					System.out.printf("%3c",' '); //공백 출력
				else if (i <= j)
				    System.out.printf("%3d",data--); //숫자 출력
			}
			System.out.println();
		}
	}
}
