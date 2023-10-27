package chap5;

public class ArrayEx7 {
	public static void main(String[] args) {
		String[] arr = {"1234","333","234","135"};//6+9+9+9
		//arr 배열의 모든 숫자 자리수의 합을 출력하기
		int sum = 0;
		//arr.length : 4
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length();j++) {
				//arr[1] : 333
				//arr[1].length() : String 의 문자열의 길이.
				//arr[1].charAt(j) : j번째 존재하는 char 문자 리턴
				sum += arr[i].charAt(j) - '0';
			}
		}
		System.out.println(sum);
	}
}
