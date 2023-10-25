package chap4;

import java.util.Scanner;

/*
 * 삼각형의 높이를 입력받아서 *로 삼각형 출력하기
 * [결과]
 * 삼각형의 높이:3
        i    j  
   *    1    1
   **   2    2
   ***  3    3
   ===== 2
        i    j
   ***  3    3
   **   2    2 
   *    1    1
   ===== 3
         i    j      if(i <=j) *출력, else 공백
     *   3    3
    **   2    2,3
   ***   1    1,2,3
   ===== 4
         i    j 
   ***   1    1 2 3    if(i<=j) *출력, else 공백
    **   2      2 3 
     *   3        3  
   
 */
public class Exam6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("삼각형의 높이:");
		int h = scan.nextInt();
		System.out.println("1번 삼각형=======");
		for(int i=1;i<=h;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("2번 삼각형=======");
		for(int i=h;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("3번 삼각형=======");
		for(int i=h;i>=1;i--) {
			for(int j=1;j<=h;j++) {
				if(i<=j) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
	}
}
