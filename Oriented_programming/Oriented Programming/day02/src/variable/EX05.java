package variable;

//리터럴: 즉시 사용되는 값을 의미
	// - 변수에 저장되지 않고 곧장 사용되는 값
	// - 리터럴은 각 타입의 대표타입으로 크기가 결정된단

public class EX05 {
	public static void main(String[] args) {
		//다양한 타입의 변수를 작성
		boolean bo = true;
		char ch='A';				//'A'	vs	"A"
									//"App" --> 'A' 'p' 'p' '\0' --> \0: 문자열의 끝임을 암시(실제 코드로 작성하지는 않음)
		
		byte by=127; 				// 정수의 대표형은 int이지만 byte의 범위안에 있는 숫자이므로 자동형변환이 되어 저장되는 것
		
		short sh=32767; 			// 정수의 대표형은 int이지만 short의 범위안에 있는 숫자이므로 자동형변환이 되어 저장되는 것
		
		int it=2000000000;			// 정수의 대표형은 int --> if) int의 범위 밖의 숫자를 입력하면 에러가 발생 --> 다른 에러와는 다름: int의 범위를 벗어났다는 에러가 발생함
		long lo=3000000000L;		// 마지막의 'L'은 정수를 int가 아닌 long 형으로 잡으라는 의미임
		
		float f1=1.1234567890123F;	// 실수의 기본 타입은 double, 마지막의 F는 리터럴을 float으로 잡으라는 의미 + float은 소수점 7자리 즉, 더 입력해도 출력안됨(반올림 됨)
		double db=1.12345678901234;
/*
		double db=1.12345678901234;
		- db 				 --> 저장된 것: 변수
		- 1.12345678901234 --> 바로 사용: 리터럴
		
		★핵심은 저장해두냐 or 바로 사용하냐의 차이
	*/	
		
		System.out.println("bo = "+bo);
		System.out.println("ch = "+ ch);
		System.out.println("by = "+ by);
		System.out.println("sh = "+ sh);
		System.out.println("it = " + it);
		System.out.println("lo = " + lo);
		System.out.println("f1 = "+ f1);
		System.out.println("db = "+ db);				//여기는 변수
		System.out.println("db = "+ 1.12345678901234);	//여기는 리터럴
		
		//상수: 저장되지 않고 사용하는 값
		//변수: 변수에 저장해놓고 사용하는 값
		
	}
}
