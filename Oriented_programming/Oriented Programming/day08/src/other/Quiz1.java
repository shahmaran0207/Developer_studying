package other;
/*
	Up/Down 게임
	1. 프로그램 시작시 랜덤으로 숫자를 하나 뽑는다(1 ~ 100)
	2. 사용자에게 정수를 입력받는다.
	- 1. 정답과 일치하면 '정답'을 출력 후 프로그램 종료
	- 2. 정답 숫자가 낮으면 'Down' 출력 후 다시 입력받음
	- 3. 정답 숫자가 높으면 'UP' 출력 후 다시 입력받음
	
 */

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		//필요한 변수
		double ran;
		int ran2, num=-99;
		int count=0;
		String conse="\n정답 %d와 입력하신 숫자 %d가 일치하여 프로그램을 종료합니다.\n";
		
		//랜덤 추출
		ran=(Math.random()*100);
		ran2=(int)ran;
		Scanner sc=new Scanner(System.in);
//		System.out.println("답: "+ran2);
		
		//게임 시작
		while(num!=ran2) {
			count+=1;
			System.out.print("정수 하나를 입력하세요: ");
			num=sc.nextInt();
			if(num>ran2) System.out.println("Down");
			else if(num<ran2) System.out.println("UP");
		}
		System.out.printf(conse, ran2, num);
		System.out.println("소요된 횟수: "+count);
		
		sc.close();
	}
}
