package chap5;

import java.util.Scanner;

/*
 *  2차원 배열을 이용하기
[결과]
삼각형의 높이를 입력하세요
5
15 14 13 12 11 
   10  9  8  7 
       6  5  4 
          3  2 
             1
*/
public class Exam6 {
	public static void main(String[] args) {
    //1. 숫자의 시작값을 data에 저장하기
		System.out.println("삼각형의 높이를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int len = scan.nextInt();
		int data = 0; //숫자시작부분 저장
		for(int i=1;i<=len;i++) {
			data += i;
		}	
		//높이와 같은 행과열을 가지 배열 matrix 생성하기
		int[][] matrix = new int[len][len];
		//숫자 각자리수에 저장하기
		for(int i=0;i < len;i++) {
			for(int j=i;j<len;j++) {
				matrix[i][j] = data--; 
			}
		}
		for(int[] arr : matrix) {
			for(int a : arr) {
				if (a==0) 
					System.out.printf("%3c",' ');
				else
				    System.out.printf("%3d",a);
			}
		    System.out.println();
		}
	}
}
