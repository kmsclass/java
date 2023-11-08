package chap11;
/*
 * 문자열 1,20,30,40,50 의 숫자 합을 출력하기
 */
public class Exam3 {
	public static void main(String[] args) {
		String str = "10,20,30,40,50";
		String[] arr = str.split(","); //[1,20,30,40,50]
		int sum = 0;
		for(String a : arr)
			sum += Integer.parseInt(a); //정수 <= 문자열
		System.out.printf("%s 문자열의 숫자의 합:%d\n",str,sum);
	}
}
