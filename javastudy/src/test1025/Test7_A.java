package test1025;

import java.util.Scanner;

/*
 * 삼각형의 높이를 입력받아 다음 삼각형을 출력하기
 [결과]
 삼각형의 높이 : 3
    * 
   ***
  *****
 
 */
public class Test7_A {
	public static void main(String[] args) {
		System.out.print("삼각형의 높이 :");
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int b = h*2-1;
		int m = b/2;
		for(int i=0;i<h;i++) {
		   for(int j=0;j<b;j++) {
			   if(j >= m-i && j<= m+i) 
				   System.out.print("*");
			   else
				   System.out.print(" ");
		   }
		   System.out.println();
		}

	}
}
