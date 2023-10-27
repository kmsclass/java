package chap5;
/*
 * str 문자열 내에 각 소문자의 갯수 출력하기
 * 1. 소문자만 갯수 구하기
 * 2. cnt 배열의 요소가 1이상인 데이터만 출력하기
 * 3. cnt 배열 값만큼 *출력하기
 *    a:4개=>****
 *    b:1개=>*
 *    c:5개=>*****
 */
public class Exam3 {
	public static void main(String[] args) {
		String str="aaaa가bbbb나   ccccddddeeegh";
		char[] alpha = str.toCharArray(); 
		int[] cnt = new int[26];
		for(int i=0;i<alpha.length;i++) {
			if(alpha[i] >= 'a' && alpha[i] <= 'z')
			   cnt[alpha[i]-'a']++;
		}
		for(int i=0;i<cnt.length;i++) {
			if(cnt[i] > 0) {
			   System.out.print((char)(i+'a')+":"+cnt[i]+"개=>");
			   for(int j=0;j<cnt[i];j++) System.out.print("*");
			   System.out.println();
			}
		}
	}
}
