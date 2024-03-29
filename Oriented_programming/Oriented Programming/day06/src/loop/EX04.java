package loop;

/*
	반복문 for
		- 초기, 조건, 증감
		- 반복 횟수 파악이 용이해서 지정 횟수 반복에 자주 사용됨
		- 또, 뒤에 배울 배열 같은 묶음 타입의 반복에도 사용됨
 */

public class EX04 {
	public static void main(String[] args) {
		
		//※(초기값; 조건식; 증감식) {종속문}
		//초기값 → 처음 조건식 참 → 종속문 → 증감식 →조건식→ 종속문 → 증감식.... →→→→(조건식이 거짓이 될 떄까지 반복함)
		//초기값은 처음 한번만 실행되고 다시는 실행되지 않음
		
		for(int i =1; i<=5; i++) {
			System.out.println(i+": Hello World");
		}
		
	}
}
