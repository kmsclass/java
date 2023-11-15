package chap14;

import java.io.File;

/*
 * c:/windows 폴더의 하위 폴더 갯수와 파일의 갯수, 파일의 총크기 출력하기
 */
public class Exam5 {
	public static void main(String[] args) {
		File f1 = new File("c:/windows");
//		File f1 = new File("d:/");
		int dircnt=0,filecnt=0;
		long size=0;
		String[] files = f1.list();
		for(String f : files) {
			File f2 = new File(f1,f);
			if(f2.isDirectory()) {
				System.out.println(f);
				dircnt++;
			}
			else if (f2.isFile()) {
				filecnt++;
				size += f2.length();
			}
		}
		System.out.println("폴더의 갯수:"+dircnt);
		System.out.println("파일의 갯수:"+filecnt);
		System.out.println("파일의 크기의 합:"+size);
	}
}
