package chap13;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * 1. 대한민국=서울,캐나다=오타와,영국=런던 값을 저장하는 HashMap 객체를 map 이름으로 생성하기.
 * 2. 화면에서 나라이름을 입력받아 수도출력하기. 종료 입력시까지 계속 입력받기
 *    => 등록된 나라가 아닌 경우 : 등록된 나라가 아닙니다. 메세지 출력하기
 * 3. 등록된 나라가 아닌 경우 수도를 입력받아 map 등록하기   
 *    => 프로그램 종료전 map에 등록된 내용 출력하기
 */
public class Exam4 {
	public static void main(String[] args) {
		//1. 
		Map<String,String> map = new HashMap<>();
		map.put("대한민국", "서울");
		map.put("캐나다", "오타와");
		map.put("영국", "런던");
		System.out.println(map);
		//2.
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("나라이름을 입력하세요(종료:종료)");
			String nat = scan.next();
			if(nat.equals("종료")) break;
			String cap = map.get(nat);
			if(cap == null) {
				System.out.println(nat + ": 등록된 나라가 아닙니다.");
				System.out.println(nat + "의 수도를 입력하세요");
				cap = scan.next();
				map.put(nat, cap);
			} else {
				System.out.println(nat + "의 수도: " + cap);
			}
		}
		System.out.println(map);
		System.out.println("=========");
		for(String k : map.keySet()) 
			System.out.println(k + "=" + map.get(k));
		System.out.println("=========");
		for(Map.Entry<String, String> e : map.entrySet()) 
			System.out.println(e.getKey() + "=" + e.getValue());
	}
}
