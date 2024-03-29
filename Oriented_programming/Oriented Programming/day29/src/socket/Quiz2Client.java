package socket;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Quiz2Client {
	public static void main(String[] args) throws IOException {
		Socket client=new Socket("192.168.112.25", 14000);
		System.out.println("서버에 연결됨");
		
		Scanner input=new Scanner(client.getInputStream());

		Thread resive=new Thread(()-> {
			String msg="";
			while(input.hasNext()) {
				msg=input.nextLine();	
				System.out.println("\n클라이언트: "+msg);
			}
		});
		resive.start();
		
		PrintWriter pw=new PrintWriter(client.getOutputStream(), true);
		Scanner sc=new Scanner(System.in);
		
		String sendmsg="";
		
		do {
			System.out.print("\n입력: ");
			sendmsg=sc.nextLine();
			
			pw.println(sendmsg);
			
		} while("0".equals(sendmsg)==false);
		

		

		
		sc.close();
		client.close();
		System.out.println("연결 종료");
	}
}