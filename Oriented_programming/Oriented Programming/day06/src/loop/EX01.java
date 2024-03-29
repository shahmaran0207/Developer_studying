package loop;

import java.util.Scanner;
/*
	while문 순서: 조건 → 종속문
*/

public class EX01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=-1; //여기서 n을 비우면 초기화 되지 않아서 오류발생
		
		while(n!=0) {
			System.out.print("정수 입력(0: 종료): ");
			n=sc.nextInt();
			
			System.out.println("n= "+n+"\n");
		}
		System.out.println("프로그램 종료");
		sc.close();
	}
}
