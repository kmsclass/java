package test1116;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * ThreadEx8번의 DataAddThread 를 Runnable 인터페이스를 구현하는
 *    방식으로 변경하기 
 */
public class Test1_A {
	public static void main(String[] args) {
		List<String> words = new ArrayList<String>();
		String[] data = {"태연","유리","윤아","효연","수영","서현","써니"};
		int interval = 3 * 1000; // 3초
		Scanner scan = new Scanner(System.in);
		words.add(data[0]);
//Runnable 인터페이스 : run() 추상메서드 1개 => FunctionalInterface => 람다식 가능
		Thread t1 = new Thread(()->{
			while (true) {
				words.add(data[(int) (Math.random() * data.length)]);
				try {
					Thread.sleep(interval);
				} catch (InterruptedException e) {}
			}			
		});
		t1.setDaemon(true); //데몬스레드로 설정
		t1.start(); //스레드 시작 기능
		while (true) {
			System.out.println(words);
			System.out.print(">>");
			String input = scan.next().trim();
			words.remove(input);
			if (words.size() == 0)
				break;
		}
		System.out.println("프로그램 종료");
	}
}
