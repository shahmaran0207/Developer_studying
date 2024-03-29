package loop;

import java.util.Scanner;

public class EX03 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		
		while(true) {
			System.out.print("정수 입력(0: 종료): ");
			n=sc.nextInt();
			
			System.out.println("n= "+n+"\n");

			if (n==0) break; //break는 n이 0일때 실행되는 종속문일 뿐, if문에 영향을 주지 않음 → while문에 영향을 주는 것!
							 //현재 코드에서  break가 없다면 루프를 탈출할 방법이 없어 에러 발생
		}
		
		System.out.println("프로그램 종료");
		sc.close();
	}
}