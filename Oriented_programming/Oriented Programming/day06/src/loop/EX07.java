package loop;

/*
 	중첩 반복문
 		- 반복문 안에 또 반복문을 구성
 		- 단일 반복문의 구문 자체를 반복
 */

/*
	코드 복사 붙여넣기
		- 가장 쉬운 코드 재사용법
		- 그러나 유지/보수가 굉장히 어려움/귀찮음/까다로움
*/

public class EX07 {
	public static void main(String[] args) {
		for(int j=1; j<=3; j++) {		//바깥 for문: 행반복
			
			for(int i=1; i<=5; i++) {	//안쪽 for문: 열반복
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}
