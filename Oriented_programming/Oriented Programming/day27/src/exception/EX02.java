package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

//1. throws를 활용하지 않은 경우
public class EX02 {

	//입력을 수행하는 메서드 → 정수가 아니면 예외 발생함
	static int input() {
		Scanner sc=new Scanner(System.in);
		int n=0;

		try {
			System.out.print("정수 입력: ");
			n=sc.nextInt();

		} catch(InputMismatchException e) {
			System.out.println("정수 아님");

		} finally {
			sc.close();
		}
		return n;
	}
	
	//전달받은 정수만큼 타임을 출력
	static void timmer(int n) {
		for(int i=n; i>=1; i--) {
			System.out.println(i+"초");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
		System.out.println("종료");
	}

	public static void main(String[] args) {
		int n=input();
		
		timmer(n);
	}
}