package thread;

import java.util.Scanner;

public class EX03 {
	static Thread inputTh=new Thread(()-> {
		Scanner sc=new Scanner(System.in);
		String msg;
		System.out.print("입력: ");
		msg=sc.nextLine();
		System.out.println(msg);
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			System.out.println("입력 완료");
		}
		sc.close();
	});
	public static void main(String[] args) {
		//입력 진행 동안 같이 실행할 코드
		Thread timer=new Thread(()->{
			for(int i=10; i>=1; i--) {
				System.err.println(i+"초 남았습니다.");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {}
			}
		});

		inputTh.start();
		timer.start();
	}
}