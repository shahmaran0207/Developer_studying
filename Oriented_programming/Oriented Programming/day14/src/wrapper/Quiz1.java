package wrapper;

import java.util.Random;
import java.util.Scanner;

/*
	word라는 문자열에서 랜덤으로 문자 8 자리를 추출 해서 문자열을 생성
	그 후 추출한 문자열을 출력 후 사용자에게 동일한 문자열을 입력받는다
	문자열이 일치하면 인증성공을 화면에 출력
 */

public class Quiz1 {
	public static void main(String[] args) {
		String words="abcedfghijklmnopqrstuvwxyz";
		String user, answer="";
		Scanner sc=new Scanner(System.in);
		Random rn=new Random();
		int n1, index=0;
		
		while(index++<8) {
			n1=rn.nextInt(words.length());
			answer+=words.charAt(n1);
		}
		
		System.out.println("인증코드: "+answer);
		System.out.print("\n사용자 입력: ");
		user=sc.next();
		
		if(user.equals(answer)) System.out.println("인증성공");
		else System.out.println("인증 실패");
		
		sc.close();
	}
}
//코드를 클래스로 분할