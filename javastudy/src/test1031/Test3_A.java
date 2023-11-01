package test1031;
/*
3. 동전을 표현하는 Coin 클래스 구현하기
      멤버변수 :  동전의 면(side)
      멤버메서드 : flip() 
           기능 : 동전을 던져 동전의 면을 변경한다. Math.random() 메서드 이용. 
                 앞면,뒷면 출력함. 
*/
class Coin {
	int side;  //0:앞면, 1:뒷면 => 멤버변수, 필드(Field)
	void flip() {
		side = (int)(Math.random()*2); //동전의 앞면,뒷면 설정
//		System.out.println(side==0?"앞면":"뒷면");
	}
}

public class Test3_A {
	public static void main(String[] args) {
		Coin coin = new Coin();
		System.out.println(coin.side==0?"앞면":"뒷면");
		coin.flip();
		System.out.println(coin.side==0?"앞면":"뒷면");
	}
}
