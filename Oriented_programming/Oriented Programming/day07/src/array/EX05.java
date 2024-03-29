package array;
/*
 	1. 크기가 4인 실수형 배열 생성
 	2. 1번의 실수에 아무 값이나 채운다
 	3. 배열 요소 모두를 일렬로 출력
 	4. 배열 요소 전체의 합계/평균을 출력
 */

public class EX05 {
	public static void main(String[] args) {
		double[] dbs=new double[] {11, 1.3, 4.5, 6.4};
		double db=0.0;
		
		for(int i=0; i<dbs.length; i++) {
			System.out.print(dbs[i]+", ");
			db+=dbs[i];
		}
		
		System.out.println("\n합계: "+db);
		System.out.println("평균: "+(db/dbs.length));
	}
}