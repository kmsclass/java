package chap15;

import java.util.Arrays;
import java.util.List;

/*
 * Function,ToIntFunction을 이용하여 다음 결과가 나오도록 프로그램 작성하기
 * [결과]
 * 이름목록: 홍길동,김삿갓,이몽룡,김자바,박자바,
 * 나이목록:10,30,15,25,20,
 * 총나이합산:100
 * 나이 평균: 20.0
 */
class Person {
	String name;
	int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return name + "," + age;
	}
}
public class Exam1 {
	static List<Person> list = Arrays.asList(new Person("김삿갓",30),
	new Person("이몽룡",15),new Person("김자바",25),new Person("박자바",20));
	public static void main(String[] args) {
		System.out.print("이름목록:");
		printString();
		System.out.print("나이목록:");
		printInt();
		System.out.print("총나이합산:");
		printTot();
		System.out.print("나이 평균:");
		printAvg();
	}
}
