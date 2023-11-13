package chap13;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/*
 * TreeSet을 이용하여 Lotto번호 생성 구현하기
 */
public class Exam3 {
	public static void main(String[] args) {
		Set<Integer> lotto = new TreeSet<>();
		/*		
		Random ball = new Random();
		ball.setSeed(System.currentTimeMillis());
		while(lotto.size() < 6) {
			lotto.add(ball.nextInt(45) + 1); //1~45임의의 수
		}
		System.out.println(lotto);
        */
		while(lotto.size() < 6) {
			lotto.add((int)(Math.random() * 45) + 1);
		}
		System.out.println(lotto);
	}
}
