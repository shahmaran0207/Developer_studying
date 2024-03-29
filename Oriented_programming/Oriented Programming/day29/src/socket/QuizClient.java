package socket;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class QuizClient {
	public static void main(String[] args) throws IOException {
		Socket client=new Socket("localhost", 12000);
		System.out.println("서버에 연결됨");

		PrintWriter pw=new PrintWriter(client.getOutputStream(), true);
		Scanner sc=new Scanner(System.in);
		String clientmsg;

		//서버에서 받기 위한 객체
		Scanner input=new Scanner(client.getInputStream());
		String servermsg;

		do {
			System.out.println("전송: ");
			clientmsg=sc.nextLine();

			pw.println(clientmsg);

			servermsg=input.nextLine();
			System.out.println("서버: "+servermsg);

		} while("0".equals(clientmsg)==false);


		client.close();
		sc.close();
		System.out.println("접속 종료");
	}
}