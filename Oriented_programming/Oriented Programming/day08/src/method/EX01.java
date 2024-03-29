package method;
/*
 	메서드의 타입
 	1. 반환값이 없는 메서드: void형 메서드
 	2. 반환값이 있는 메서드: 자료형 메서드
 	
 	※반환값
 	- 메서드 실행 후 돌려주는 값(=데이터)
 	- 저그, 메서드 실행 결과값을 의미
 */

public class EX01 {
	//반환값이 없는 메서드(void)
	static void adder(int n1, int n2) {
		int sum1=n1+n2;
		System.out.printf("adder1: %d + %d =%d\n\n", n1, n2, sum1);
	}
	
	//반환값이 있는 메서드(=int) 
	//※반환형과 반환 타입은 반드시 일치해야 함!
	//★메서드의 이름과 기능도 일치시켜야 함! → 타 사용자에게 혼란을 야기할 수 있음
	static int adder2(int n1, int n2) {
		int sum=n1+n2;
		
		return sum;
	}
	
	public static void main(String[] args) {
		//1. void형 메서드는 반환값이 없다 → 그냥 이름만 호출해서 쓴다
		//☆변수가 없다고해서 반드시 void형인 것은 아니다! void형이 아닐 수도 있음
		adder(5,6);

		//2. 자료형이 있는 메서드는 반환값이 있다
		// → 따라서 같은 자료형 변수에 저장 받거나 
		//★왼쪽에 변수가 오면 절대로  void형이 아님!
		int result=adder2(5,6);	//★함수 메서드가 호출 → 호출한 결과값을 result에 대입!
//		int result=11;
		System.out.println("result= "+result);
		System.out.println("result*2= "+result*2);
		
		//→ 다른 메서드의 전달값으로 바로 사용한다.
		System.out.println("\nadder2(3, 1)= "+adder2(3,1));
//		System.out.println("\nadder2(3, 1)= "4);
		
		//※연습) 아래 결과값을 유추
		int n=adder2(adder2(3,7), adder2(7,6)); //10, 13, 23
//		int n=adder2(10, 13);
//		int n=23;
		
		System.out.println("\nn= "+n);
	}
}