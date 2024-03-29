package control;

import java.util.Scanner;

/*
	버스 소요 시간)
	버스는 각 역 평균 이동 시간이 2분이다.
	하지만 10정거장이 넘어가면 이동 시간이 4분으로 늘어나는 규칙을 가지고 있다. 
	이때. 사용자에게 정류장 수를 입력받아서 소요시간을 출력한다.
	
	+
	60분이 넘어가면 시간/분으로 나누어 출력
	
	ex)
	1. 입력: 5 → 10분
	2. 입력: 11 → 24분
	3. 입력: 21 → 1시간 6분
*/

public class Quiz1 {
	public static void main(String[] args) {
		int time=2, depot;
		String conse="총 소요 시간은 %d시간 %d분 입니다.\n";
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("이동할 정류장 수를 입력하세요: ");
		depot=sc.nextInt();
		
		int result=depot*time;
		
		if (depot>10) {
			result=time*10;
			result+=(depot-10)*4;
		}
		
		int hour=result/60;
		result-=60*hour;
		
		if (result>=60) {
			System.out.printf(conse, hour, result);
		}
		
		else {
			System.out.printf(conse, hour, result);
		}
		
		sc.close();
	}
}