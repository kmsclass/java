package chap12;
class InterruptThread extends Thread {
	@Override
	public void run () {
		System.out.println("자고 있어요. 깨우지 마세요");
		try {
			sleep(10000000);
		} catch(InterruptedException e) {
			System.out.println("누가 깨웠나요?");
			e.printStackTrace();
		}
	}
}
public class ThreadEx9 {
	public static void main(String[] args) throws InterruptedException {
		InterruptThread t1 = new InterruptThread();
		t1.start();
		Thread.sleep(2000);
		t1.interrupt();
	}
}
