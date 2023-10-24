package chap2;

public class Test1 {
	public static void main(String[] args) {
     //1. 잘못된 문장을 골라내고 그 이유를 설명하시오.		
        char       a='a';   //정상
//	    char       b="a";   //오류.  " ":String, ' ':char   
	    String     c="a";   //정상
//	    String     d='a';   //오류   " ":String, ' ':char
//	    char       e='ab';  //오류 char형은 문자 한개만 가능 
	    String     f="ab";  //정상 
//	    char       g = '';  //오류 char형은 문자 한개만 가능
	    String     h = "";  //정상 String형은 빈문자열 가능

//	    byte   var1 = 128;   //-128 ~ 127까지만 저장 가능 
		short  var2 = 128;   //정상 
//		int    var3 = 128L;  //28L long형 리터널. int <- long 형변환
		long   var4 = 128L;  //정상
//		float  var5 = 1.2;   //실수형 리터널은 double형임
		double var6 = 1.2;   //정상 
	    float var9 = '1';    //정상 float <- char 형변환. '1'아스키코드값 49
	    System.out.println(var9); //49.0
	    
	}
}
/*
2.   변수를 선언하기 위해서는 자료형과 변수의 이름을 결정해야합니다. 
      변수 이름으로 사용할 수 있는 것을 고르시오. C
      변수이름으로 사용할 수 없는 이유를 작성하시오
      A. false    : 예약어
      B. default  : 예약어
      C. _var     
      D. a-class  : - 변수명 사용 불가. _,$만 가능
      
3. 변수를 선언하기 위해서는 자료형과 변수의 이름을 결정해야합니다.
   변수 이름으로 사용할 수 있는 것을 고르시오.  C.
    A. s#arp  : # 변수명 사용 불가
    B. static : 예약어 
    C. _class 
    D. class  : 예약어 
    
4. byte 형을 저장할 수 있는 데이터 값의 허용 범위는 얼마입니까?
     -128 ~ 127
 
5. float 형 변수 선언이 올바르게 된 것을 모두 고르시오.
   A. float f1 = 1F; 
   B. float f2 = 1.0; 
   C. float f3 = '1';  
   D. float f4 = "1";  
   E. float f5 = 1.0d;      
*/

