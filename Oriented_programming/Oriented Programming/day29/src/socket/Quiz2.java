package socket;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) throws IOException {
		ServerSocket server=new ServerSocket(14000);
		System.out.println("서버 On, 연결 대기 중");

		Socket client =server.accept();
		System.out.println("클라이언트 연결됨\n");

		Scanner input=new Scanner(client.getInputStream());

		Thread resive=new Thread(()-> {
			String msg="";
			while(input.hasNext()) {
				msg=input.nextLine();	
				System.out.println("\n클라이언트: "+msg);
			}
		});

		//		resive.run();//run()은 그냥 메서드 호출이라 메인 스레드가 run으로 넘어감
		resive.start(); //메인 스레드는 실행시켜주고 그대로 계속 진행됨, 
		//				start는 별도 스레드 생성

		//		
		//보낼 코드
		String sendmsg="";
		Scanner sc=new Scanner(System.in);
		PrintWriter pw=new PrintWriter(client.getOutputStream(), true);
		do {
			System.out.print("\n입력: ");
			sendmsg=sc.nextLine();

			pw.println(sendmsg);

		} while("0".equals(sendmsg)==false);


		client.close();
		server.close();
		System.out.println("연결 종료");
	}
}