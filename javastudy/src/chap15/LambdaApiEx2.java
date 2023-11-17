package chap15;

import java.util.function.IntSupplier;
import java.util.function.Supplier;

/*
 * Supplier 인터페이스 
 *  매개변수는 없고, 리턴값은 존재함
 *  T getXXX() 추상 메서드를 가짐
 */
public class LambdaApiEx2 {
	public static void main(String[] args) {
		Supplier<String> s1 = ()->"Java";
		System.out.println(s1.get());
		//IntSupplier : 정수값을 리턴 
		//IntSupplier를 이용하여 임의의 주사위값(1~6) 리턴
//		IntSupplier s2 = ()->(int)(Math.random()*6)+1;
		IntSupplier s2 = ()->{
			return (int)(Math.random()*6)+1;
		};
		System.out.println(s2.getAsInt());
		//IntSupplier를 이용하여 1~100까지의 값 리턴
		s2 = ()->{
			int sum = 0;
			for(int i=1;i<=100;i++) sum += i;
			return sum;
		};
		System.out.println(s2.getAsInt());
		
	}
}
