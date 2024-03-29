package method;
/*
 	메서드 오버로딩(method overloading)
 	- 같은 이름의 메서드를 여러개 작성하는 기법

 	규칙)
 	1. 메서드 이름이 동일해야 함
 	2. 매개변수 형태가 달라야 함
 	3. 반환형은 관계없음 !!!
 	ex)
 		static int adder(int n) {
		return 100+n;
		}
	
		static double adder(int n) {
		return 0.0;
		}
		
		★오버로딩 주 목적: 여러 타입을 받아서 사용하기 위함
 */

public class EX04 {
	static int adder(int n1, int n2) {
		return n1+n2;
	}
	
	static int adder(int n) {
		return 100+n;
	}
	
	static double adder(double n) {
		
		return 3.14+n;
	}
	
	static int adder() {
		return 100+200;
	}
	
	public static void main(String[] args) {
//		★java에서는 메서드 호출시 '이름과 전달인자'를 확인해서 호출함
//		- 일치하는 것이 없으면 당연히 에러 발생함
		
		System.out.println("adder(5,6) = "+adder(5,6));
		System.out.println("adder(5)= "+adder(5));
		System.out.println("adder(5.0)= "+adder(5.0));
		System.out.println("adder()= "+adder());
		
//		int<double → double크기가 더 크므로 
//		static int adder(int n) {
//			return 100+n;
//		} 이 코드를 주석처리하면 
//		
//		System.out.println("adder(5)= "+adder(5)); 이 코드 실행시
//		static double adder(double n) {
//			return 3.14+n;
//		}가 실행됨
//		즉, int를 double에 넣는건 가능, 반대는 안됨
	}
}