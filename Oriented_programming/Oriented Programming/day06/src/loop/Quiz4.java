package loop;
/*
	1. 1 ~ 1000까지의 합계를 출력
	2. 1~ 1000까지의 합계를 출력 단, 3의 배수는 합에서 제외
	3. 1~1000까지의 합계를 출력 단, 3의 배수는 합에서 제외, 3/5 공배수는 합에서 포함
*/

public class Quiz4 {
	public static void main(String[] args) {
		int num=0, num2=0, num4=0, sum=0;
		String conse="%d번 답은 %d입니다. \n\n";
		
		
		for (int i=1; i<=1000; i++) {
			num+=i;
//			//디버깅 → 지우는 것보다는 주석처리해서 남겨두는 것이 좋음 →→코드는 수정하는 경우가 더 많기 떄문
//			System.out.printf("i= %d, sum= %d\n", i, num);
			
			if(i%3==0) {
				num2+=i;
				num4+=i;
				if(i%3==0 && i%5==0) num4-=i;
			}
		}
		
//		for(int i=1; i<=1000; i++) {
//			if(i %3 ==0 && i%5==0) {
//				//이렇게 비어있는 종속문도 의미가 있음 → if가 빈 종속문이라도 실행되면 else if문은 건너뛰기 때문
//			}
//			else if(i %3==0) {
//				continue;
//			}
//			sum+=i;
//		}
		
		System.out.printf(conse, 1, num);
		System.out.printf(conse, 2, (num-num2));
		System.out.printf(conse, 3, (num-num4));
	}
}
