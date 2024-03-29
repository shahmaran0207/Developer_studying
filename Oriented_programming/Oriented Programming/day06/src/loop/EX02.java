package loop;

import java.util.Scanner;

/*
	do ~ while문 순서: 종속문 → 조건
	
	※	종속문을 먼저 실행하기 때문에 종속문이 '무조건 한번'은 실행이 됨
*/
public class EX02 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n;
		
		do {
			System.out.print("정수 입력(0: 종료): ");
			n=sc.nextInt();
			
			System.out.println("n= "+n+"\n");
		} while(n !=0);
		
		sc.close();
	}
}
