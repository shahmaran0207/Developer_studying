package exception;
/*
	오류: 프로그램에서 발생하는 오작동 등을 의미
	1. 에러: 시스템 레벨의 오류를 의미, 잘못된 문법이나 기계적 오류		→ 어떻게 예측/처리할 방법이 따로 없음
	2. 예외: 소프트웨어에 레벨의 오류. 잘못된 입력이나 연산을 통한 오류
	
	 예외는 발생 후 혹은 발생 전에 미리 예측 후 처리 가능
	 이를 예외 처리라고 함
	 
	 예외 처리 이유)
	 1. 예외가 발생해도 실행을 이어가야 할 때
	 2. 예외 처리를 하지 않으면 사용하지 못하는 메서드들이 있을 때 (이 이유가 더 크다)
 */

public class EX01 {
	public static void main(String[] args) {
		try {	//try: 예외 발생을 감지하는 구문. 발생한 예외는 catch로 전달
			System.out.println(10/0);
			System.out.println("try에서 예외가 발생하면");
			System.out.println("발생시점 이후의 코드는 실행하지 않음");
		} catch(ArithmeticException e) {
			//catch: 예외 발생시 처리하는 구문
			System.err.println("예외 발생\n");
			System.err.println("에러 메세지: "+e.getMessage());
			e.printStackTrace();
//			System.err.println("예외 발생\n"); → 글자가 붉은색으로 출력됨, 예외 출력할 떄 사용함, 다른 때 사용하지 않도록 주의!
//			원래의 실행 흐름은 위에서 하나로 하나로 실행됨
//			그런데 out과 err은 동시에 실행됨 → 순서가 꼬이거나 한줄로 동시에 출력될 수 도 있음
		}
		System.out.println("프로그램 종료");
	}
}