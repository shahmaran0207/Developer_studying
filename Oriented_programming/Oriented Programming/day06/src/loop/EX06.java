package loop;

public class EX06 {
	public static void main(String[] args) {
		//보조 제어문 break
		for (int i=1; i<=10; i++) {
			if(i==5) {
				break;	//break: 제어문을 '즉시'종료시킴 → 반복문을 종료시킬 떄 가장 많이 사용됨
			}
			
			System.out.print(i+" ");
		}
		System.out.println();
		
		//보조 제어문 continue
		for (int i=1; i<=10; i++) {
			if(i==5) {
				continue;	//continue: 제어문을 '즉시 처음으로' 보냄 → 즉, 아래것이 실행되지 않음 → 주로 특정 부분을 실행시키지 않으려 할 때 주로 사용함
			}
			
			System.out.print(i+" ");
		}
		System.out.println();
		
		//보조 제어문 continue
		for (int i=1; i<=10; i++) {
			if(i%2==0) {
				continue;	//continue: 제어문을 '즉시 처음으로' 보냄 → 즉, 아래것이 실행되지 않음 → 주로 특정 부분을 실행시키지 않으려 할 때 주로 사용함
			}
			
			System.out.print(i+" ");
		}
		System.out.println();
		
	}
}
