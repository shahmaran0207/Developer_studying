package method;
/*
 	※재귀: 다시 되돌아 오다.
 	
	재귀함수(Recursive Method)
	- 함수 내부에서 자기 자신을 호출해서 구현가능
	- 다양한 자료구조 구현 및 알고리즘에 자주 사용되므로 숙지하면 좋음 
 */

/*
		static void func(int n) {
		
			if(n==0) return;
		func(n-1);						→ 0이 되기전까지는 다시 함수를 호출하므로 출력이 되지 않음
		System.out.println("n= "+n);	→ 0이 된 후, if문을 통해 종료하고, 함수가 끝났으니, 마지막 1부터 출력 → 돌아가서 2 출력... → 마지막 3까지 출력후 메인으로 돌아감
	}
	
	→→→이게 재귀인 이유: 함수를 출력하면서 한번 끝까지 갔다가, 출력을 위해 역순으로 다시 올라가게 됨 onedrive 그림 참고!!!
 */

public class EX05 {
	static void func(int n) {
		
			if(n==0) {					//재귀는 종료가 될 조건이 필요함
										//그렇지 않으면 무한루프 → 프로그램 뻗음
			return;
		}
		System.out.println("n= "+n); 	//재귀 전
		func(n-1);						//재귀 시작
		System.out.println("n= "+n);	//재귀 후
	}
	
	public static void main(String[] args) {
		func(3);
	}
}