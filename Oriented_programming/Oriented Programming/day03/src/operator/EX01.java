package operator;

public class EX01 {
	public static void main(String[] args) {
		//산술 연산자: 사칙 연산을 제공
		
		int n=10;
		System.out.println("n= "+n);
		System.out.println("n+5 = "+ n + 5); // 코드가 좌에서 우로 실행됨 → n이 자동형변환으로 문자열으로 변환→5도 문자열로 변환되어 105 출력됨
		System.out.println("n+5 = "+ (n + 5));
		
		// ★산술연산은 변수의 값을 변경하지 않음
		System.out.println("n = " + n +"\n" );
		
		//System.out.println("n-5 = "+ n - 5); //문자열에서는 + 기호만 됨 → (-)기호 쓰니까 에러
		
		System.out.println("n -5 = "+(n-5));
		System.out.println("n*2 = " + n*2);
		System.out.println("n/3 = "+  n /3);
		System.out.println("n/3.0 = "+n/3.0);
		System.out.println("n%3 = "+n%3+"\n");
		
		//우선순위 테스트
		//1. % vs 나누기  vs 곱하기	→ 동일
		//2. 더하기 vs 빼기		→ 동일
		
		System.out.println(6+7-2/2*3);
		System.out.println(41 % 3 /5);
	}
}
