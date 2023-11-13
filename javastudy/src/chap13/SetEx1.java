package chap13;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 * Collection : 객체들의 모임 
 *    List : 순서유지. 인덱스사용. 가변배열. 구현클래스=> ArrayList,Vector,LinkedList
 *    Set  : 중복불가. 인덱스사용불가.  
 *           구현클래스=> 
 *           HashSet : 중복불가
 *           TreeSet : 정렬. 중복불가
 *           LinkedHashSet : 순서유지.중복불가 
 * Map : (key,객체)쌍인 객체들의 모임
 * 
 * Set 주요 메서드
 *   boolean add(Object) : 추가성공(true),추가실패(false) 
 */
public class SetEx1 {
	public static void main(String[] args) {
		Object[] arr = {"홍길동",1, "1","김삿갓","이몽룡","홍길동","성춘향"
				,"향단이","홍길동","김삿갓"};
//		Set<Object> set1 = new HashSet<>();
//		Set<Object> set1 = new TreeSet<>();
		Set<Object> set1 = new LinkedHashSet<>();
		Set<Object> set2 = new HashSet<>();
		Set<Object> set3 = new HashSet<>();
		for(int i=0;i < arr.length;i++) {
			if(!set1.add(arr[i])) {
				if(!set2.add(arr[i])) {
					set3.add(arr[i]);
				}
			}
		}
		System.out.println(set1);
		System.out.println(set2);
		System.out.println(set3);
		//set 객체는 인덱스 사용 불가 => 개선된 for 구문 사용가능
		System.out.print("set1:");
		for(Object o : set1) System.out.print(o+",");
		System.out.println();
		System.out.print("set2:");
		for(Object o : set2) System.out.print(o+",");
		System.out.println();
		System.out.print("set3:");
		for(Object o : set3) System.out.print(o+",");
		System.out.println();
	}
}

