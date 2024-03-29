package operator;

//※전치 > 비교 中 NOT연산자 > 산술 > 비교 > 논리 > 조건 > 대입 > 후치

public class EX08 {
	public static void main(String[] args) {
		//조건 연산자: 참/거짓에 따라서 값을 선택하는 연산자 → 삼항연산자(항이 3개임 조건, 참, 거짓) → 둘 중 하나 고르는 것만 가능, 여러개 고르는 것은 불가능!
		//(조건) ? 참:거짓
		
		int n=-10;
		
		String positive=(n>=0)? "양수":"음수";
//		String positive="양수"; (n >=0 일떄 )
//		String positive="음수"; (n >=0 일때 )
		
		System.out.printf("%d(은)는 %s 입니다.\n", n, positive);
	}
}
