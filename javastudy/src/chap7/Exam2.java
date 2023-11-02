package chap7;
/*
 * Buyer 클래스
 * 멤버변수 : money = 500, point
 *          Product[] items = new Product[5]  => 장바구니.
 *          int cnt  => 구매갯수
 * 멤버메서드
 *     void buy(Product p)
 *       1. p상품의 가격을 money에서 차감
 *       2. p상품의 포인트을 point 증가
 *       3. items에 p제품을 추가. cnt 증가
 *       4. p제품의 이름 출력. 예)TV구입
 *      
 *     void summary()
 *       1. 구매 제품 전체의 금액 합계, 포인트 합계 출력
 *       2. 잔액 출력
 *       3. 전체 구매 물품 이름 출력         
 */
public class Exam2 {
	public static void main(String[] args) {
		Tv t = new Tv();  
		Computer c = new Computer();
		HandPhone h = new HandPhone();
		Buyer b = new Buyer();
		b.buy(t);		b.buy(c);		b.buy(h);	b.summary();
		System.out.println("main Buyer 잔액:"+b.money);
		System.out.println("main Buyer 포인트:"+b.point);		
	}
}
