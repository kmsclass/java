package chap5;

import java.util.Scanner;

/*
 * 10진수를 입력받아 16진수로 변경하기
 * int[] 배열 사용불가. 0123456789ABCDEF 데이터 필요
 */
public class ArrayEx5 {
	public static void main(String[] args) {
		//toCharArray : char[] <= 문자열 변환해줌
		char[] data = "0123456789ABCDEF".toCharArray();
		char[] hex = new char[8]; //변환된 16진 데이터 저장, 11
		System.out.println("16진수로 변환할 10진수 입력");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt(); //17
		int divnum = num;
		int index = 0; //2
		while(divnum > 0) { //0
			hex[index++] = data[divnum%16]; //divnum%16:1
			divnum /= 16;
		}
		System.out.print(num+"의 16진수:");
		for(int i=index-1;i>=0;i--)System.out.print(hex[i]);
		System.out.println();
		//클래스를 이용한 16진수 변환
		System.out.println(Integer.toHexString(num));
	}
}
