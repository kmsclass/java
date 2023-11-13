package chap13;

import java.util.Comparator;
import java.util.TreeSet;
/*
 * 사용자 클래스의 객체를 TreeSet에 저장하기
 * 1. Comparable<T> 인터페이스 구현 => 클래스에 구현. 기본정렬 방식 설정 사용
 *    int compareTo(T o);
 * 2. Comparator<T> 인터페이스 구현 => 기본정렬외에 다른 방식 사용. 실행시 정렬방식 설정
 *    int compare(T o1,T o2)   
 * 
 */
//기본정렬방식 : 이름순 정렬이 되도록 정렬방식 설정하기
class PhoneNo implements Comparable<PhoneNo>{
	String name;
	int number;
	public PhoneNo(String name, int number) {
		super();
		this.name = name;
		this.number = number;
	}
	public String toString() {
		return name+":"+number;
	}
	@Override
	public int compareTo(PhoneNo o) {
		return name.compareTo(o.name);
	}
}
public class SetEx4 {
	public static void main(String[] args) {
		TreeSet<PhoneNo> set = new TreeSet<>(); //기본정렬방식으로 정렬
		set.add(new PhoneNo("홍길동",1234));
		set.add(new PhoneNo("김삿갓",2345));
		set.add(new PhoneNo("이몽룡",3456));
		System.out.println(set);
		System.out.println("전화번호의 역순으로 정렬 하기"); //Comparator 인터페이스
/*		
		TreeSet<PhoneNo> set2 = new TreeSet<>(new Comparator<PhoneNo>() {
			@Override
			public int compare(PhoneNo o1, PhoneNo o2) {
				return o2.number - o1.number;
			}
		});
*/
		//람다식이용
		TreeSet<PhoneNo> set2 = new TreeSet<>((o1,o2)->o2.number - o1.number);
		set2.add(new PhoneNo("홍길동",1234));
		set2.add(new PhoneNo("김삿갓",2345));
		set2.add(new PhoneNo("이몽룡",3456));
		System.out.println(set2);
	}
}
