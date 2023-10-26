package chap4;
/*
 * break   : switch,반복문 에서 구문을 벋어남
 * continue: 반복문의 처음으로 이동
 */
public class LoopEx4 {
	public static void main(String[] args) {
		for(int i=2;i<=9;i++) { //i=3
			System.out.println("\n" + i + "단");
			for(int j=2;j<=9;j++) { //j=2
//				if (j==5) break; //break가 속한 반복문에서 빠짐.
				if (j==5) continue; //이시점에서 바로 반복문의 처음으로 이동.이후문장 실행안함
				System.out.println(i + "*" + j+"="+(i*j));
			}
		}
	}
}
