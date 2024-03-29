package switch_;
/*
	선택문 switch
		- 값에 따라서 코드를 분기
		- 값은 정수와 문자열 사용 가능
		- case에는 하나의 값 만을 입력할 수 있음
	
	※ switch 문으로 작성된 구문은 전부 if로 구현 가능
	단, 반대는 아님!
	
	★ if 문은 각 조건을 뛰어넘지 못함  → 반면 switch문은 조건을 뛰어넘어 해당하는 조건으로 바로 이동  → switch문이 더 효율적
	
	결론
	1. 단일 값 조건 처리는 if보다 switch가 더 빠르다.
	2. 범위 조건 처리는 switch가 거의 불가능하니 if로 처리하는게 수월하다.
*/

import java.util.Scanner;

public class EX01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		
		System.out.print("입력(1~3): ");
		n=sc.nextInt();
		
		switch(n) {
		
		case 1:
			System.out.println("1번 선택");
			break;	//break: 제어문을 '즉시' 종료(=탈출) → 밑에 남은 코드가 실행되지 않음
		
		case 2:
			System.out.println("2번 선택");
			break;
		
		case 3:
			System.out.println("3번 선택");
			break;
		
		default:	//어차피 제일 마지막 구문이므로 break를 입력할 필요가 없음 → 관례적으로 가장 마지막에 적는 것이지 문법상 정해진 것이 아님  → 혹시라도 가장 아래에 적으려면 break를 써야함
			System.out.println("잘못된 입력입니다.");
		}
		//switch는 해당하는 위치로 점프 → 중괄호 닫힐 떄 까지 전부 실행함
		
		System.out.println("\n프로그램 종료");
		sc.close();
	}
}
