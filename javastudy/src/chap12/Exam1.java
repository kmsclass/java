package chap12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * ThreadEx3.java 소스의 SumThread를 Runnable를 구현한 SumRunnable 클래스로 변경하여
 * 구현하기
 */
class SumRunnable implements Runnable {
	int startnum, lastnum,sum;
	SumRunnable(int startnum,int lastnum) {
		this.startnum = startnum;
		this.lastnum = lastnum;
	}
	@Override
	public void run() {
		for(int i=startnum;i<=lastnum;i++) {
			sum += i;
		}
	}
}
public class Exam1 {
	public static void main(String[] args) throws InterruptedException {
		List<SumRunnable> list = Arrays.asList
				(new SumRunnable(1,200),new SumRunnable(201,400),
				 new SumRunnable(401,600),new SumRunnable(601,800),
				 new SumRunnable(801,1000));
//		Thread t1 = new Thread(list.get(0));
//		Thread t2 = new Thread(list.get(1));
		List<Thread> tlist = new ArrayList<>();
		for(SumRunnable r : list) tlist.add(new Thread(r));
		for(Thread t : tlist) t.start();
		for(Thread t : tlist) t.join();
		int sum = 0;
		for(SumRunnable r : list) sum += r.sum;
		System.out.println("1~1000까지의 전체 합:" + sum);
	}
}
