package loop;

/*
 	1. 구구단 2단을 단일 반복으로 출력
 	2. 1번을 중첩 반복으로 변경 후 구구단 2단을 8번 출력
	3. 2번을 변경하여 2단~9단 출력
	4. 3번 역순으로 출력
 */

public class EX08 {
	public static void main(String[] args) {
		for(int j=2; j<10; j++) {
			System.out.printf("%d단\n", j);
			for(int i=1; i<10; i++) {
				System.out.printf("%d X %d = %d\n", j, i, j*i);
			}
			System.out.println();
		}
	
	System.out.println("역순 출력");
	for(int j=9; j>1; j--) {
		System.out.printf("%d단\n", j);
		for(int i=9; i>0; i--) {
			System.out.printf("%d X %d = %d\n", j, i, j*i);
			}
			System.out.println();
		}
	}
}
