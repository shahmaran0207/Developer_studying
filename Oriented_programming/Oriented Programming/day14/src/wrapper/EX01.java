package wrapper;
/*
	wrap: 둘러싸다
	wrapper class: 일반타입 자료형을 클래스로 취급하기 위해서 만든 클래스
	
	일반 타입			wrapper
	------------------------------
	boolean			Boolean
	char			Character
	byte			Byte
	short			Short
	int				Integer
	long			Long
	float			Float
	double			Double
	
	1. 일반 타입을 사용할 수 없는 구간에 사용		→ Generic
	2. 문자열과 형 변환시 사용
 */

public class EX01 {
	public static void main(String[] args) {
		//일반 타입
		int n1=10;
		
//		wrapper	→  java.lnag에 있음 → 따로 import가 필요 없다!
		Integer n2=20;
		
		System.out.println("n1= "+n1);
		
//		Wrapper의 toString()은 저장된 값이 출력되게 오버라이딩 되어 있음
		System.out.println("n1= "+n1);
		System.out.println("n2= "+n2.toString());
//		참조변수를 출력했는에 해시코드가 안나옴 → → 오버라이딩 된 것
		
//		※필드나 메서드를 가진 Wrapper 보단 일반 타입이 가볍다
//		즉, Wrapper의 기능이 필요 없는 경우는 일반 타입이 성느엥 도움됨
	}
}