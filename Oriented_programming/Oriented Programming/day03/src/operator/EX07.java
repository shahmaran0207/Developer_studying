package operator;

public class EX07 {
	public static void main(String[] args) {
		//논리 연산자: true / false를 연산
		//※전치 > 비교 中 NOT연산자 > 산술 > 비교 > 논리 > 대입 > 후치
		
		//true: 0제외 나머지
		//false: 0
		
		//1. &&: And → 양쪽 모두 참이면 결과가 참 → 곱연산
		System.out.println("true	and true의 결과:	"	+(true	&&true));
		System.out.println("true	and false의 결과:	"	+(true	&&false));
		System.out.println("false	and true의 결과:	"	+(false	&&true));	//&&의 경우 둘 중 하나라도 거짓이면 거짓 → 앞이 거짓이므로 뒤에 무엇이 오든 거짓 → 죽은 코드임
		System.out.println("false	and false의 결과:	"	+(false	&&false));
		System.out.println();
		
		//2. ||: OR → 양쪽 모두 거짓이면 결과가 거짓 → 합연산
		System.out.println("true	|| true의 결과:	"	+(true	||true));//	 ||의 경우 둘 다  거짓이면 거짓 → 앞이 참이므로 뒤에 무엇이 오든 참 → 죽은 코드임
		System.out.println("true	|| false의 결과:	"	+(true	||false));
		System.out.println("false	|| true의 결과:	"	+(false	||true));
		System.out.println("false	|| false의 결과:	"	+(false	||false));
		System.out.println();
		
		//3. !: NOT → 참을 거짓으로, 거짓을 참으로 → 반전 연산자 (TV on/off 등과 같이 상태를 반전시킬때 사용함)
		//※ 산술연산자보다 우선순위가 높다
		System.out.println("not true 결과	: "+!true);
		System.out.println("not false 결과	: "+!false);
		
	}
}
