package chap14;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * 화면에서 내용을 exit 문자열이 입력될때 까지 입력받아 data.txt 파일에 저장하기
 * FileWriter 이용하기 => 한글은 깨지지 않도록 저장하기
 */
public class Exam2 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		FileWriter fw = new FileWriter("data.txt");
		System.out.println("저장할 내용을 입력하세요:(종료:exit)");
		while(true) {
			String data = scan.nextLine();
			if(data.equals("exit")) break;
			fw.write(data+"\n");
		}
		fw.flush();
	}
}