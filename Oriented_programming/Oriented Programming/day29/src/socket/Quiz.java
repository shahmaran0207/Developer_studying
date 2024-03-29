package socket;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//양방향(반이중)
//- 클라이언트와 서버가 서로 1번씩 메세지를 주고 받는 코드 작성

public class Quiz {
	public static void main(String[] args) throws IOException {
		ServerSocket server=new ServerSocket(12000);
		System.out.println("서버 On, 연결 대기 중");

		Socket client =server.accept();
		System.out.println("클라이언트 연결됨\n");

		PrintWriter pw=new PrintWriter(client.getOutputStream(), true);
		Scanner sc=new Scanner(System.in);
		String servermsg;

		//클라이언트에서 받기 위한 객체
		Scanner input=new Scanner(client.getInputStream());
		String clientmsg;


		while(input.hasNext()) {
			clientmsg=input.nextLine();
			System.out.println("클라: "+clientmsg);

			System.out.print("\n서버: ");
			servermsg=sc.nextLine();

			pw.println(servermsg);
		}

		input.close();
		client.close();
		server.close();
		pw.close();
		sc.close();

		System.out.println("접속 종료");
	}
}